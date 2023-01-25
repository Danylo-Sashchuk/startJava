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
        int number = 5;
        System.out.println(number);
        if (number == 0) {
            System.out.println("\tЧисло равно нулю.");
        } else {
            if (number % 2 == 0) {
                System.out.print("\tЧисло является четным");
            } else {
                System.out.print("\tЧисло является нечетным");
            }
            if (number > 0) {
                System.out.println(" и положительным.");
            } else {
                System.out.println(" и отрицательным.");
            }
        }

        System.out.print("\n4) Поиск одинаковых цифр в числах ");
        num1 = 991;
        num2 = 113;
        boolean isCommon = false;
        System.out.println(num1 + " и " + num2 + ":");
        if (num1 % 10 == num2 % 10) {
            System.out.println("\tОдинаковый первый разряд: " + (num1 % 10));
            isCommon = true;
        }
        if (num1 % 100 / 10 == num2 % 100 / 10) {
            System.out.println("\tОдинаковый второй разряд: " + (num1 % 100 / 10));
            isCommon = true;
        }
        if (num1 / 100 == num2 / 100) {
            System.out.println("\tОдинаковый третий разряд: " + (num1 / 100));
            isCommon = true;
        }
        if (!isCommon) {
            System.out.println("\tОдинаковых цифр нет.");
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
        double percent = 0.01;
        if (deposit < 100_000) {
            percent = 0.05;
        } else if (deposit <= 300_000) {
            percent = 0.07;
        }
        double interest = deposit * percent;
        System.out.println("\tСумма вклада: " + deposit);
        System.out.println("\tНачисленный процент: " + interest);
        System.out.println("\tИтоговая сумма: " + (deposit + interest));

        System.out.println("\n7) Определение оценки по предметам:");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 2;
        int programmingGrade = 2;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }
        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        }
        System.out.println("\tИстория: " + historyGrade);
        System.out.println("\tПрограммирование: " + programmingGrade);
        System.out.println("\tСредний бал: " + ((historyGrade + programmingGrade) / 2));
        System.out.println("\tСредний процент: " + ((historyPercent + programmingPercent) / 2));

        System.out.println("\n8) Расчет прибыли за год:");
        int rent = 5_000;
        int income = 13_000;
        int costPrice = 9_000;
        int profit = 12 * (income - rent - costPrice);
        System.out.print("\tПрибыль за год: ");
        if (profit > 0) {
            System.out.println("+" + profit);
        } else {
            System.out.println(profit);
        }

        System.out.println("\n9) Подсчет количества банкнот:");
        int goal = 567;
        int sum = 0;
        int hundredsOnHands = 0;
        int tensOnHands = 0;
        int onesOnHands = 0;
        int hundredsInATM = 10;
        int tensInATM = 5;
        int onesInATM = 50;
        int needHundreds = goal / 100;
        if (hundredsInATM >= needHundreds) {
            sum += needHundreds * 100;
            hundredsOnHands = needHundreds;
        } else {
            sum += hundredsInATM * 100;
            hundredsOnHands = hundredsInATM;
        }
        int needTens = goal - (sum / 10);
        if (tensInATM >= needTens) {
            sum += needTens * 10;
            tensOnHands = needTens;
        } else {
            sum += tensInATM * 10;
            tensOnHands = tensInATM;
        }
        int needOnes = goal - sum;
        if (onesInATM >= needOnes) {
            sum += needOnes;
            onesOnHands = needOnes;
        } else {
            sum += onesInATM;
            onesOnHands = onesInATM;
        }
        if (sum < goal) {
            System.out.println("\tВ банкомате не хватает купюр!");
        } else {
            System.out.println("\tТребуется " + hundredsOnHands + " сотен");
            System.out.println("\tТребуется " + tensOnHands + " десятков");
            System.out.println("\tТребуется " + onesOnHands + " единиц");
            System.out.println("\tВам выдаётся " + sum + "$ в " + (hundredsOnHands + tensOnHands + 
                    onesOnHands) + " купюрах.");
        }
        int test = onesOnHands + tensOnHands * 10 + hundredsOnHands * 100;
        if (test != goal) {
            System.out.println("Проверка выявила ошибку, исчисления не верны.");
        }
    }
}