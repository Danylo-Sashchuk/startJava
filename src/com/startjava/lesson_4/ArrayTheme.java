package com.startjava.lesson_4;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1) Реверс значений массива: ");
        int[] intArray = {2, 1, 7, 3, 6, 4, 5};
        System.out.print("Массив до модификации: ");
        printIntArray(intArray);
        for (int i = 0, j = intArray.length - 1; i < j; i++, j--) {
            int temp = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = temp;
        }
        System.out.print("\nМассив после модификации: ");
        printIntArray(intArray);

        System.out.println("\n\n2) Вывод произведения элементов массива: ");
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(10);
        }
        String zerosAndNines = "";
        String resultStatement = "";
        int multiplicationResult = 1;
        for (int i = 0; i < intArray.length; i++) {
            resultStatement += intArray[i] == 0 || intArray[i] == 9 ? "" : " * " + intArray[i];
            zerosAndNines += intArray[i] == 0 || intArray[i] == 9 ? intArray[i] + " под индексом " + i + "; " : "";
            multiplicationResult *= intArray[i] == 0 || intArray[i] == 9 ? 1 : intArray[i];
        }
        System.out.println(resultStatement + " = " + multiplicationResult);
        System.out.println("В массиве находятся: " + zerosAndNines);

        System.out.println("\n3) Удаление элементов массива: ");
        double[] doubleArray = new double[15];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = rand.nextDouble();
        }
        int midIndex = doubleArray.length / 2;
        double targetNumber = doubleArray[midIndex];
        int zeroedCounter = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] > targetNumber) {
                doubleArray[i] = 0.0;
                zeroedCounter++;
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.printf("%1.3f ", doubleArray[i]);
        }
        System.out.println();
        for (int i = 8; i < 15; i++) {
            System.out.printf("%-1.3f ", doubleArray[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек = " + zeroedCounter);

        System.out.println("\nВывод элементов массива лесенкой в обратном порядке: ");
        char[] capitalLetters = new char[26];
        for (int i = 0, j = 65; i < capitalLetters.length; i++, j++) {
            capitalLetters[i] = (char) j;
        }
        for (int i = capitalLetters.length - 1; i > -1; i--) {
            for (int j = capitalLetters.length - 1; j >= i; j--) {
                System.out.print(capitalLetters[j]);
            }
            System.out.println();
        }

        System.out.println("5) Генерация уникальных чисел");
        intArray = new int[30];
        for (int i = 0; i < intArray.length; i++) {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(60, 100);
            } while (isExist(intArray, randomNumber));
            intArray[i] = randomNumber;
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
    }

    private static void printIntArray(int[] array) {
        for (Object item : array) {
            System.out.print(item + " ");
        }
    }

    private static boolean isExist(int[] array, int number) {
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
