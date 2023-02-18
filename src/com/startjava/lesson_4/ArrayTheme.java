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
    }

    private static void printIntArray(int[] array) {
        for (Object item : array) {
            System.out.print(item + " ");
        }
    }
}
