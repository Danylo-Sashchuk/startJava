public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1) Подсчет суммы четных и нечетных чисел:");
        int evenSum = 0;
        int oddSum = 0;
        int pointer = -10;
        do {
            if (pointer % 2 == 0) {
                evenSum += pointer;
            } else {
                oddSum += pointer;
            }
            pointer += 1;
        } while (pointer <= 21);
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

        System.out.println("\n4) Вывод чисел на консоль в несколько строк: ");
        int start = 1;
        int end = 24;
        int numbersInLine = 0;
        for (int i = start; i < end; i += 2) {
            if (numbersInLine == 5) {
                numbersInLine = 0;
                System.out.println();
            }
            System.out.printf("%3d", i);
            numbersInLine += 1;
        }
        while (numbersInLine < 5) {
            System.out.printf("%3d", 0);
            numbersInLine += 1;
        }

        System.out.println("\n\n5) Проверка количества двоек на четность/нечетность: ");
        number = 3242592;
        int counter = 0;
        int temp = number;
        while (temp != 0) {
            if (temp % 10 == 2) {
                counter += 1;
            }
            temp /= 10;
        }
        boolean isEven = false;
        if (counter % 2 == 0) {
            isEven = true;
        }
        System.out.print("\tЧисло " + number + " содержит");
        if (isEven) {
            System.out.println(" четное количество двоек.");
        } else {
            System.out.println(" нечетное количество двоек.");
        }

        System.out.println("\n6) Отображение фигур в консоли: ");
        char symbol = '*';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        symbol = '#';
        counter = 5;
        while (counter > 0) {
            temp = counter;
            while (temp > 0) {
                System.out.print(symbol);
                temp -= 1;
            }
            System.out.println();
            counter -= 1;
        }
        symbol = '$';
        counter = 0;
        do {
            temp = 0;
            counter += 1;
            do {
                temp += 1;
                System.out.print(symbol);
            } while (temp < counter);
            System.out.println();
        } while (counter < 3);
        counter = 2;
        do {
            temp = 0;
            do {
                temp += 1;
                System.out.print(symbol);
            } while (temp < counter);
            counter -= 1;
            System.out.println();
        } while (counter > 0);

        System.out.println("\n7) Отображение ASCII-символов: ");
        System.out.printf("\t%S%5S\n", "DEC", "CHAR");
        for (int i = 33; i < 48; i += 2) {
            char curSymbol = (char)i;
            System.out.printf("\t%3d%5s\n", i, curSymbol);
        }
        for (int i = 98; i < 123; i += 2) {
            char curSymbol = (char)i;
            System.out.printf("\t%3d%5s\n", i, curSymbol);
        }

                System.out.println("\n8) Проверка, является ли число палиндромом: ");
        number = 9233129;
        temp = number;
        int reverseNumber = 0;
        while (temp != 0) {
            reverseNumber = reverseNumber * 10 + temp % 10;
            temp /= 10;
        }
        if (reverseNumber == number) {
            System.out.println("Число " + number + " является палиндромом.");
        } else {
            System.out.println("Число " + number + " не является палиндромом.");
        }

        System.out.println("\n9) Определение, является ли число счастливым");
        number = 300111;
        int sum1 = 0;
        int sum2 = 0;
        System.out.print("\tСумма цифр ");
        for (int i = 0; i < 3; i++) {
            temp = number % 10;
            System.out.print(temp);
            sum1 += temp;
            number /= 10;
        }
        System.out.print(" = " + sum1 + "\n\tСумма цифр ");
        for (int i = 0; i < 3; i++) {
            temp = number % 10;
            System.out.print(temp);
            sum2 += temp;
            number /= 10;
        }
        System.out.println(" = " + sum2);
        if (sum1 == sum2) {
            System.out.println("\tЧисло является счастливым.");
        } else {
            System.out.println("\tЧисло не является счастливым.");
        }

    }
}