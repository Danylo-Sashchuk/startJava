import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.print("\tПриветствую!\nПервый игрок, введите свое имя: ");
        Player firstPlayer = new Player(scanName());
        System.out.print("Второй игрок, теперь вы: ");
        Player secondPlayer = new Player(scanName());
        GuessNumber guessGame = new GuessNumber(firstPlayer, secondPlayer);
        do {
            Player winner = guessGame.startGame();
            System.out.println("Поздравляем! " + winner.getName() + ", вы угадали число!");
        } while (startOver());
        System.out.println("Хорошего дня!");
    }

    private static String scanName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

    private static boolean startOver() {
        while (true) {
            Scanner scan = new Scanner(System.in);
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