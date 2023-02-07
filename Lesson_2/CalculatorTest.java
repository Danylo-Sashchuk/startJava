import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setNum1(scanNum());
        calc.setSign(scanSign());
        calc.setNum2(scanNum());
        calc.calculate();
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
}