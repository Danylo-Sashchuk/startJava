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
    }
}