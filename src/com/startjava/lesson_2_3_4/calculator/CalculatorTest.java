package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        do {
            Calculator calculator = new Calculator();
            calculator.setNum1(scanNum());
            calculator.setSign(scanSign());
            calculator.setNum2(scanNum());
            calculator.calculate();
        }
        while (startOver());
        System.out.println("До свидания!");
    }

    private static int scanNum() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userNum = scan.nextInt();
        return userNum;
    }

    private static char scanSign() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите знак математической операции: ");
        char userSign = scan.nextLine().charAt(0);
        return userSign;
    }

    private static boolean startOver() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Хотите продолжить вычисления? [y/n]:");
            char answer = scan.nextLine().charAt(0);
            if (answer == 'y') {
                return true;
            } else if (answer == 'n') {
                return false;
            }
        }
    }
}