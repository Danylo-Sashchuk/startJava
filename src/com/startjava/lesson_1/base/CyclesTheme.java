package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1) Подсчет суммы четных и нечетных чисел:");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("\tВ промежутке [-10; 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\n2) Вывод чисел в интервале (min и max) в порядке убывания: ");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3) Вывод реверсивного числа и суммы его цифр: ");
        int number = 1234;
        int sum = 0;
        System.out.print("\tРеверсивное число: ");
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
            System.out.print(digit);
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
            numbersInLine++;
        }
        for (int i = numbersInLine; i < 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5) Проверка количества двоек на четность/нечетность: ");
        number = 3242592;
        int counterTwos = 0;
        int copyNumber = number;
        while (copyNumber > 0) {
            if (copyNumber % 10 == 2) {
                counterTwos++;
            }
            copyNumber /= 10;
        }
        System.out.print("\tЧисло " + number + " содержит");
        if (counterTwos % 2 == 0) {
            System.out.println(" четное количество двоек.");
        } else {
            System.out.println(" нечетное количество двоек.");
        }

        System.out.println("\n6) Отображение фигур в консоли: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        System.out.println();
        int lineNumber = 5;
        while (lineNumber > 0) {
            int symbolsInLine = lineNumber;
            while (symbolsInLine > 0) {
                System.out.print('#');
                symbolsInLine--;
            }
            System.out.println();
            lineNumber--;
        }
        System.out.println();

        int currentLine = 0;
        int needSymbolsInLine = 1;
        boolean isIncreasingOrder = true;
        do {
            int currentSymbol = 0;
            do {
                System.out.print('$');
                currentSymbol++;
            } while (currentSymbol < needSymbolsInLine);
            System.out.println();
            currentLine++;
            if (needSymbolsInLine == 3) {
                isIncreasingOrder = false;
            }
            if (!isIncreasingOrder) {
                needSymbolsInLine--;
            } else {
                needSymbolsInLine++;
            }
        } while (currentLine < 5);

        System.out.println("\n7) Отображение ASCII-символов: ");
        System.out.printf("\t%S%5S\n", "DEC", "CHAR");
        for (int i = 33; i < 48; i += 2) {
            System.out.printf("\t%3d%5c\n", i, i);
        }
        for (int i = 98; i < 123; i += 2) {
            System.out.printf("\t%3d%5c\n", i, i);
        }

        System.out.println("\n8) Проверка, является ли число палиндромом: ");
        number = 9233129;
        copyNumber = number;
        int reverseNumber = 0;
        while (copyNumber > 0) {
            reverseNumber = reverseNumber * 10 + copyNumber % 10;
            copyNumber /= 10;
        }
        if (reverseNumber == number) {
            System.out.println("Число " + number + " является палиндромом.");
        } else {
            System.out.println("Число " + number + " не является палиндромом.");
        }

        System.out.println("\n9) Определение, является ли число счастливым");
        number = 900333;
        int sum1 = 0;
        int sum2 = 0;
        int firstHalf = number / 1000;
        int secondHalf = number % 1000;
        int firstHalfCopy = firstHalf;
        int secondHalfCopy = secondHalf;
        for (int i = 0; i < 3; i++) {
            int digit = firstHalf % 10;
            sum1 += digit;
            firstHalf /= 10;
            digit = secondHalf % 10;
            sum2 += digit;
            secondHalf /= 10;
        }
        System.out.printf("\tСумма цифр %d = %d\n\tСумма цифр %d = %d\n", firstHalfCopy, sum1,
                secondHalfCopy, sum2);
        if (sum1 == sum2) {
            System.out.println("\tЧисло является счастливым.");
        } else {
            System.out.println("\tЧисло не является счастливым.");
        }

        System.out.print("\n10) Вывод таблицы умножения Пифагора:\n  ");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.print("\n-|");
        for (int i = 2; i < 10; i++) {
            System.out.print("---");
        }
        for (int i = 2; i < 10; i++) {
            System.out.printf("\n%d|", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i*j);
            }
        }
    }
}
