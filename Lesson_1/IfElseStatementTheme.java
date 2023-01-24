public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1) Перевод псевдокода на язык Java:");
        int age = 22;
        if (age > 20) {
            System.out.println("\tО, вам пошел третий десяток!");
        } else {
            System.out.println("\tКак вам ваша молодость?");
        }

        boolean isMale = true;
        if (!isMale) {
            System.out.println("\tВы не мужчина, как вы себя в таком случае идентифицируете?");
        } else {
            System.out.println("\tВы мужчина, теперь живите с этим.");
        }

        double height = 1.7;
        if (height < 1.80) {
            System.out.println("\tВаш рост ниже чем 180 см.");
        } else {
            System.out.println("\tОго, а вы высокие!");
        }

        char firstNameLetter = "Данила".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("\tВаше имя начинается с буквы М. Вы Максим?");
        } else if (firstNameLetter == 'I') {
            System.out.println("\tIvan, вы ли это?\n");
        } else {
            System.out.println("\tЯ не знаю первую букву вашего имени, подскажите!");
        }

        System.out.println("\n2) Поиск max и min числа:");
        int num1 = 10;
        int num2 = 10;
        if (num1 > num2) {
            System.out.println("\tМаксимальное число = " + num1);
            System.out.println("\tМинимальное число = " + num2);
        } else if (num1 < num2) {
            System.out.println("\tМаксимальное число = " + num2);
            System.out.println("\tМинимальное число = " + num1);
        } else {
            System.out.println("\tЧисла " + num1 + " и " + num2 + " равны.");
        }

        System.out.print("\n3) Проверка числа: ");
        int number = -4;
        System.out.println(number);
        if (number == 0) {
            System.out.println("\tВходящее число равно нулю.");
        } else {
            if (number % 2 == 0) {
                System.out.println("\tВходящее число является четным.");
            }
            else {
                System.out.println("\tВходящее число является нечетным.");
            }
            if (number > 0) {
                System.out.println("\tВходящее число является положительным.");
            }
            else {
                System.out.println("\tВходящее число является отрицательным.");
            }
        }

        System.out.print("\n 4) Поиск одинаковых цифр в числах ");
        num1 = 941;
        num2 = 991;
        System.out.println(num1 + " и " + num2 + ":");
        if (num1 % 10 == num2 % 10) {
            System.out.println("\tОдинаковый первый разряд, а именно число " + (num1 % 10));
        }
        if (num1 % 100 / 10 == num2 % 100 / 10) {
            System.out.println("\tОдинаковый второй разряд, а именно число " + (num1 % 100 / 10));
        }
        if (num1 / 100 == num2 / 100 ) {
            System.out.println("\tОдинаковый третий разряд, а именно число " + (num1 / 100));
        }

        System.out.println("\n5) Определение символа по его коду: ");
        char symbol = '\u0057';
        System.out.print("\tСимвол '" + symbol + "'");
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(" это маленькая буква.");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(" это большая буква.");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(" это число.");
        } else {
            System.out.println(" это не буква и не число.");
        }

        System.out.println("\n6) Подсчет суммы вклада и начисленных банком %:");
        int deposit = 300_000;
        double procent;
        if (deposit < 100_000) {
            procent = 0.05;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            procent = 0.07;
        } else {
            procent = 0.1;
        }
        double interest = deposit * procent;
        System.out.println("\tСумма вклада: " + deposit);
        System.out.println("\tНачисленный процент: " + interest);
        System.out.println("\tИтоговая сумма: " + (deposit + interest));

        System.out.println("\n7) Определение оценки по предметам:");
        int historyProcent = 59;
        int programmingProcent = 91;
        int history;
        int programming;
        if (historyProcent > 91) {
            history = 5;
        } else if (historyProcent > 73) {
            history = 4;
        } else if (historyProcent > 60) {
            history = 3;
        } else {
            history = 2;
        }
        if (programmingProcent > 91) {
            programming = 5;
        } else if (programmingProcent > 73) {
            programming = 4;
        } else if (programmingProcent > 60) {
            programming = 3;
        } else {
            programming = 2;
        }
        System.out.println("\tИстория: " + history);
        System.out.println("\tПрограммирование: " + programming);
        System.out.println("\tСредний бал: " + ((history + programming) / 2));
        System.out.println("\tСредний процент: " + ((historyProcent + programmingProcent) / 2));
    }
}