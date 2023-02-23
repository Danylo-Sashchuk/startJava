package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {
        System.out.print("Введите математическое выражение: ");
        try {
            double result = Calculator.calculate(scan.nextLine());
            print(result);
            isNext();
        } catch (Exception e) {
            System.out.println("Введите корректные значения. ");
            main();
        }
    }

    private static void print(double result) {
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }

    private static void isNext() {
        System.out.println("Хотите продолжить вычисления? [y/n]:");
        char answer = scan.nextLine().charAt(0);
        if (answer == 'y') {
            main();
        } else if (answer != 'n') {
            isNext();
        }
    }
}
