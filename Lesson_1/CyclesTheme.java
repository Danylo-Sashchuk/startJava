public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1) Подсчет суммы четных и нечетных чисел:");
        int evenSum = 0;
        int oddSum = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter;
            }
            counter += 1;
        } while (counter <= 21);
        System.out.println("\tВ промежутке [-10; 21] сумма четных чисел = " + evenSum +
                ", а нечетных = " + oddSum);

        System.out.println("\n2) Вывод чисел в интервале (min и max) в порядке убывания: ");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        for (int i = max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3) Вывод реверсивного числа и суммы его цифр: ");
        int number = 1234;
        int sum = 0;
        System.out.print("\tРеверсивное число: ");
        while (number != 0) {
            int temp = number % 10;
            sum += temp;
            number /= 10;
            System.out.print(temp);
        }
        System.out.println("\n\tСумма его чисел: " + sum);
    }
}