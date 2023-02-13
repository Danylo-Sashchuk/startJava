public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num) {
        num1 = num;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num) {
        num2 = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public void calculate() {
        int result = 1;
        switch (sign) {
            case '+': 
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
        }
        System.out.println("Ответ: " + result);
    }
}