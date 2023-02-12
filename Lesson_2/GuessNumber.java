import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        targetNumber = generateRandomNumber();
        while(true) {
            int player1Number = playerTurn(player1);
            if (isGuessed(player1Number)) {
                System.out.println("Поздравляем! " + player1.getName() + ", вы угадали число!");
                return;
            }
            int player2Number = playerTurn(player2);
            if (isGuessed(player2Number)) {
                System.out.println("Поздравляем! " + player2.getName() + ", вы угадали число!");
                return;
            }
        }
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return (rand.nextInt(100) + 1);
    }

    private int playerTurn(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        return scan.nextInt();
    }

    private boolean isGuessed(int number) {
        if (number < targetNumber) {
            System.out.println("Число " + number + " меньше того, что загадал компьютер.");
        } else if (number > targetNumber) {
            System.out.println("Число " + number + " больше того, что загадал компьютер.");
        } else {
            return true;
        }
        return false;
    }
}