package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {
        do {
            System.out.print("Введите математическое выражение: ");
            try {
                double result = Calculator.calculate(scan.nextLine());
                print(result);
            } catch (RuntimeException e) {
                System.out.println("Введите корректные значения. ");
            }
        } while (isNext());
    }

    private static void print(double result) {
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }

    private static boolean isNext() {
        char answer = 0;
        while (answer != 'y' && answer != 'n') {
            System.out.println("Хотите продолжить вычисления? [y/n]:");
            answer = scan.nextLine().charAt(0);
        }
        return answer == 'y';
    }
}
