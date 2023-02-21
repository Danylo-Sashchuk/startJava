package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static double calculate(String input) throws Exception {
        String[] expression = input.split(" ");
        int num1 = Integer.parseInt(expression[0]);
        int num2 = Integer.parseInt(expression[2]);
        if (num1 < 0 || num2 < 0) {
            throw new Exception("Only positive numbers.");
        }
        char sign = expression[1].charAt(0);
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> (double) num1 / num2;
            case '%' -> Math.floorMod(num1, num2);
            default -> Math.pow(num1, num2);
        };
    }
}
