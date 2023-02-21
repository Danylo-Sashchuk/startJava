package com.startjava.lesson_4;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        startOver();
    }

    private static void startOver() {
        System.out.print("Введите математическое выражение: ");
        String expression = scan.nextLine();
        double result;
        try {
            result = Calculator.calculate(expression);
            print(result);
            isNext();
        } catch (Exception e) {
            System.out.println("Введите корректные значения.");
            startOver();
        }
    }

    private static void print(double result) {
        if (result - (int) result == 0.0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }

    private static void isNext() {
        System.out.println("Хотите продолжить вычисления? [y/n]:");
        char answer = scan.nextLine().charAt(0);
        if (answer == 'y') {
            startOver();
        } else if (answer != 'n') {
            isNext();
        }
    }
}
