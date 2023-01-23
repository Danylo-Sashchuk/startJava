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
    }
}