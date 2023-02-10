import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.print("\tПриветствую!\nПервый игрок, введите свое имя: ");
        Player player1 = new Player(inputName());
        System.out.print("Второй игрок, теперь вы: ");
        Player player2 = new Player(inputName());
        GuessNumber guessGame = new GuessNumber(player1, player2);
        do {
            guessGame.startGame();
        } while (startOver());
        System.out.println("Хорошего дня!");
    }

    private static String inputName() {
        String name = scan.nextLine();
        return name;
    }

    private static boolean startOver() {
        while (true) {
            System.out.println("Хотите продолжить игру? [y/n]:");
            char answer = scan.nextLine().charAt(0);
            if (answer == 'y') {
                return true;
            } else if (answer == 'n') {
                return false;
            }
        }
    }
}