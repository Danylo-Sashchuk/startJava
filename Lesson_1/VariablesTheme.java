public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1) Вывод значений переменных на консоль:");
        byte numberOfCores = 8;
        short ram = 8;
        int systemFirmwareVersion = 84_196_044;
        long daysSinceBoot = 3;
        float systemVersion = 13.1F;
        double kernelVersion = 22.2D;
        boolean active = true;
        char chip = 'M';
        System.out.println("\tNumber of cores in the processor: " + numberOfCores);
        System.out.println("\tComputer RAM: " + ram);
        System.out.println("\tSystem Firmware Version: " + systemFirmwareVersion);
        System.out.println("\tComputer has been running for " + daysSinceBoot + "days.");
        System.out.println("\tSystem version: " + systemVersion);
        System.out.println("\tKernel Version: " + kernelVersion);
        System.out.println("\tIs the computer working now? " + active);
        System.out.println("\tComputer's chip: " + chip + "\n");

        System.out.println("2) Расчет стоимости товара со скидкой:");
        int penPrice = 100;
        int bookPrice = 200;
        double discountProcent = 0.11;
        double discountAmount = (penPrice + bookPrice) * discountProcent;
        double discountPrice = (penPrice + bookPrice) - discountAmount;
        System.out.println("\tСумма скидки: " + discountAmount + " руб.");
        System.out.println("\tОбщая сумма покупки: " + discountPrice + " руб. \n");

        System.out.println("3) Вывод слова JAVA:");
        System.out.println("\t   J    a  v     v  a     ");
        System.out.println("\t   J   a a  v   v  a a     ");
        System.out.println("\tJ  J  aaaaa  V V  aaaaa    ");
        System.out.println("\t JJ  a     a  V  a     a   \n");

        System.out.println("4) Вывод min и max значений целых числовых типов:");
        byte byteMax = 127;
        System.out.println("\tПервоначальное максимальное значение byte: " + byteMax++);
        System.out.println("\tИнкрементированное значение byte: " + byteMax--);
        System.out.println("\tДекрементированное значение byte: " + byteMax);
        short shortMax = 32_767;
        System.out.println("\tПервоначальное максимальное значение short: " + shortMax++);
        System.out.println("\tИнкрементированное значение short: " + shortMax--);
        System.out.println("\tДекрементированное значение short: " + shortMax);
        int intMax = 2_147_483_647;
        System.out.println("\tПервоначальное максимальное значение int: " + intMax++);
        System.out.println("\tИнкрементированное значение int: " + intMax--);
        System.out.println("\tДекрементированное значение int: " + intMax);
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("\tПервоначальное максимальное значение long: " + longMax++);
        System.out.println("\tИнкрементированное значение long: " + longMax--);
        System.out.println("\tДекрементированное значение long: " + longMax + "\n");

        System.out.println("5) Перестановка значений переменных:");
        int first = 2;
        int second = 5;
        System.out.println("Перестановка с помощью третьей переменной: ");
        System.out.println("\tИсходные значения: first = " + first + ", second = " + second);
        int temp = first;
        first = second;
        second = temp;
        System.out.println("\tНовые значения: first = " + first + ", second = " + second);
        System.out.println("Перестановка с помощью арифметических операций: ");
        System.out.println("\tИсходные значения: first = " + first + ", second = " + second);
        first += second;
        second = first - second;
        first -= second;
        System.out.println("\tНовые значения: first = " + first + ", second = " + second);
        System.out.println("Перестановка с помощью битовой операции XOR: ");
        System.out.println("\tИсходные значения: first = " + first + ", second = " + second);
        first ^= second;
        second = first ^ second;
        first ^= second;
        System.out.println("\tНовые значения: first = " + first + ", second = " + second + "\n");

        System.out.println("6) Вывод символов и их кодов:");
        System.out.println("\tCode\tSymbol");
        char hashtag = '#';
        System.out.println("\t " + (int) hashtag + "\t  " + hashtag);
        char ampersand = '&';
        System.out.println("\t " + (int) ampersand + "\t  " + ampersand);
        char atSign = '@';
        System.out.println("\t " + (int) atSign + "\t  " + atSign);
        char caret = '^';
        System.out.println("\t " + (int) caret + "\t  " + caret);
        char underscore = '_';
        System.out.println("\t " + (int) underscore + "\t  " + underscore + "\n");

        System.out.println("7) Вывод в консоль ASCII-арт Дюка:");
        char slash = '/';
        char backSlash = '\\';
        char openingParenthesis = '(';
        char closingParenthesis = ')';
        System.out.println("\t    " + slash + backSlash);
        System.out.println("\t   " + slash + "  " + backSlash);
        System.out.println("\t  " + slash + underscore + openingParenthesis + 
                " " + closingParenthesis + backSlash);
        System.out.println("\t " + slash + "      " + backSlash);
        System.out.println("\t" + slash + underscore + underscore + underscore +
                underscore + slash + backSlash + underscore + underscore + 
                backSlash + "\n");

        System.out.println("8) Вывод количества сотен, десятков и единиц числа:");
        int number = 123;
        int ones = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;
        int mult = ones * tens * hundreds;
        int sum = ones + tens + hundreds;
        System.out.println("\tЧисло " + number + " содержит:");
        System.out.println("\t" + hundreds + " сотен");
        System.out.println("\t" + tens + " десятков");
        System.out.println("\t" + ones + " единиц");
        System.out.println("\tСумма его цифр = " + sum);
        System.out.println("\tПроизведение = " + mult + "\n");

        System.out.println("9) Вывод времени: ");
        int inputTime = 86399;
        int hours = inputTime / 3600;
        int minutes = (inputTime / 60) % 60;
        int seconds = inputTime % 60;
        System.out.println("\t" + hours + ":" + minutes + ":" + seconds);
    }
}