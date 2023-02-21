package com.startjava.lesson_4;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scan;
    private static Calculator calc;
    public static void main(String[] args) {
        calc = new Calculator();
        scan = new Scanner(System.in);
        startOver();
    }

    private static void startOver() {
        System.out.print("Введите математическое выражение: ");
        calc.setExpression(scan.nextLine());
        double result = calc.calculate();
        print(result);
        isNext();
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
