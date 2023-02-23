package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String... args) {
        Calculator calc = new Calculator();
        System.out.print("Введите математическое выражение: ");
        double result = calc.calculate(scan.nextLine());
        print(result);
        isNext();
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
