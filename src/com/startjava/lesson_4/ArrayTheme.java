package com.startjava.lesson_4;

import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1) Реверс значений массива: ");
        int[] intArray = {2, 1, 7, 3, 6, 4, 5};
        int len = intArray.length - 1;
        System.out.print("Массив до модификации: ");
        printIntArray(intArray);
        for (int i = 0; i < len; i++, len--) {
            int temp = intArray[i];
            intArray[i] = intArray[len];
            intArray[len] = temp;
        }
        System.out.print("\nМассив после модификации: ");
        printIntArray(intArray);
        System.out.println();

        System.out.println("\n\n2) Вывод произведения элементов массива: ");
        intArray = new int[]{0, 8, 5, 5, 0, 9, 4, 1, 0, 0, 0};
        len = intArray.length;
        String[] zeroesAndNines = new String[len];
        int zeroesAndNinesLen = 0;
        int[] resultArray = new int[len];
        int resultArrayCount = 0;
        int multiplicationResult = 1;
        for (int i = 0; i < len - 1; i++) {
            if (intArray[i] != 0 && intArray[i] != 9) {
                multiplicationResult *= intArray[i];
                resultArray[resultArrayCount++] = intArray[i];
            } else {
                zeroesAndNines[zeroesAndNinesLen++] = "Число " + intArray[i] + " под индексом " + i + "; ";
            }
        }
        for (int i = 0; i < resultArrayCount - 1; i++) {
            System.out.print(resultArray[i] + " * ");
        }
        System.out.print(resultArray[resultArrayCount - 1]);
        System.out.println(" = " + multiplicationResult);
        System.out.println("Нули и единицы: ");
        for (int i = 0; i < zeroesAndNinesLen; i++) {
            System.out.print(zeroesAndNines[i]);
        }

        System.out.println("\n3) Удаление элементов массива: ");
        Random rand = new Random();
        double[] doubleArray = new double[15];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = rand.nextDouble();
        }
        System.out.println("Исходный массив: ");
        printFormattedDoubleArray(doubleArray);
        double targetNumber = doubleArray[doubleArray.length / 2];
        int zeroedCounter = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] > targetNumber) {
                doubleArray[i] = 0.0;
                zeroedCounter++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        printFormattedDoubleArray(doubleArray);
        System.out.println("\nКоличество обнуленных ячеек = " + zeroedCounter);

        System.out.println("\n4)Вывод элементов массива лесенкой в обратном порядке: ");
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

        System.out.println("\n5) Генерация уникальных чисел");
        intArray = new int[30];
        for (int i = 0; i < intArray.length; i++) {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(60, 100);
            } while (isExist(intArray, randomNumber));
            intArray[i] = randomNumber;
        }
        sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\n\n6) Сдвиг элементов массива: ");
        String[] firstArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int nonEmptyCounter = 0;
        for (String s : firstArray) {
            if (!s.isBlank()) {
                nonEmptyCounter++;
            }
        }
        String[] secondArray = new String[nonEmptyCounter];
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            int nextEmptyString = findNextEmptyString(firstArray, i);
            int copyLength = nextEmptyString - i;
            System.arraycopy(firstArray, i, secondArray, j, copyLength);
            j += copyLength;
            i = nextEmptyString;
        }
        System.out.println("Исходный массив: ");
        for (String s : firstArray) {
            System.out.print(s + " ");
        }
        System.out.println("\nМассив без пустых строк: ");
        for (String s : secondArray) {
            System.out.print(s + " ");
        }
    }

    private static void printIntArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    private static void printFormattedDoubleArray(double[] array) {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%1.3f ", array[i]);
        }
        System.out.println();
        for (int i = 8; i < 15; i++) {
            System.out.printf("%1.3f ", array[i]);
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

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static int findNextEmptyString(String[] array, int start) {
        for (int i = start; i < array.length; i++) {
            if (array[i].isBlank()) {
                return i;
            }
        }
        return array.length - 1;
    }
}
