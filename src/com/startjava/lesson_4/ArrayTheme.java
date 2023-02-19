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

        System.out.println("\n\n2) Вывод произведения элементов массива: ");
        intArray = new int[10];
        len = intArray.length;
        int multiplicationResult = 1;
        for (int i = 0; i < len; i++) {
            intArray[i] = i;
        }
        for (int i = 1; i < len - 1; i++) {
            multiplicationResult *= i;
            System.out.print((i < 8 ? i + " * " : i + " = " + multiplicationResult));
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
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = len - 1; i > -1; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
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
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNotBlank = 0;
        for (String item : srcStrings) {
            if (!item.isBlank()) {
                countNotBlank++;
            }
        }
        String[] destStrings = new String[countNotBlank];
        for (int i = 0, j = 0; i < srcStrings.length; i++) {
            int nextBlankString = findNextBlankString(srcStrings, i);
            int copyLength = nextBlankString - i;
            System.arraycopy(srcStrings, i, destStrings, j, copyLength);
            j += copyLength;
            i = nextBlankString;
        }
        System.out.println("Исходный массив: ");
        printStringArray(srcStrings);
        System.out.println("\nМассив без пустых строк: ");
        printStringArray(destStrings);
    }

    private static void printIntArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    private static void printFormattedDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 8 == 0 && i != 0) {
                System.out.println();
            }
            System.out.printf("%1.3f ", array[i]);
        }
    }

    private static boolean isExist(int[] array, int number) {
        for (int item : array) {
            if (item == number) {
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

    private static int findNextBlankString(String[] array, int start) {
        for (int i = start; i < array.length; i++) {
            if (array[i].isBlank()) {
                return i;
            }
        }
        return array.length - 1;
    }

    private static void printStringArray(String[] array) {
        for (String item : array) {
            System.out.print(item + " ");
        }
    }
}
