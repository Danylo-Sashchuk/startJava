public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        char sign = '%';
        int result = 0;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        }
        System.out.printf("%d %c %d = %d", num1, sign, num2, result);
    }
}