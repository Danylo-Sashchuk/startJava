package com.startjava.lesson_4;

public class Calculator {
    private String[] expression;

    public void setExpression(String expression) {
        this.expression = expression.split(" ");
    }

    public double calculate() {
        int num1 = Integer.parseInt(expression[0]);
        char sign = expression[1].charAt(0);
        int num2 = Integer.parseInt(expression[2]);
        double result = 1;
        switch (sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num1, num2);
            case '/':
                return (double) num1 / num2;
            case '%':
                return Math.floorMod(num1, num2);
            default:
                return Math.pow(num1, num2);
        }
    }
}
