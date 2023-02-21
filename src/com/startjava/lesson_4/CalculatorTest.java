package com.startjava.lesson_4;

import java.util.Scanner;

public class CalculatorTest {
    static private Scanner scan;
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        scan = new Scanner(System.in);
        calc.setExpression(scanExpression());
        double result = calc.calculate();
        print(result);
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
}
