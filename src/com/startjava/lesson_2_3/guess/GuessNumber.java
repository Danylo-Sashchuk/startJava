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

    public void start() {
        generateTargetNumber();
        while(true) {
            int playerNumber = inputNumber(player1);
            if (isGuessed(playerNumber)) {
                System.out.println("Поздравляем! " + player1.getName() + ", вы угадали число!");
                return;
            }
            playerNumber = inputNumber(player2);
            if (isGuessed(playerNumber)) {
                System.out.println("Поздравляем! " + player2.getName() + ", вы угадали число!");
                return;
            }
        }
    }

    private void generateTargetNumber() {
        Random rand = new Random();
        targetNumber = rand.nextInt(100) + 1;
    }

    private int inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        return scan.nextInt();
    }

    private boolean isGuessed(int playerNumber) {
        if (playerNumber < targetNumber) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер.");
        } else if (playerNumber > targetNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер.");
        } else {
            return true;
        }
        return false;
    }
}