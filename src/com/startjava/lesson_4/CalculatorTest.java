package com.startjava.lesson_4;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scan;
    private static Calculator calc;
    public static void main(String[] args) {
        calc = new Calculator();
        scan = new Scanner(System.in);
        enterNumbers();
    }

    private static void enterNumbers() {
        calc.setExpression(scanExpression());
        double result = calc.calculate();
        print(result);
        isNext();
    }

    private static String scanExpression() {
        System.out.print("Введите математическое выражение: ");
        return scan.nextLine();
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
            enterNumbers();
        } else if (answer != 'n') {
            isNext();
        }
    }
}
