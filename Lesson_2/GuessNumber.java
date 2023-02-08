import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;
    private int targetNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public Player startGame() {
        targetNumber = generateTargetNumber();
        while(true) {
            if (playerTurn(firstPlayer)) {
                return firstPlayer;
            }
            if (playerTurn(secondPlayer)) {
                return secondPlayer;
            }
        }
    }

    private int generateTargetNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; 
        return randomNumber;
    }

    private boolean playerTurn(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        int number = scanNumber();
        if (isGuessed(number)) {
            return true;
        } else {
            return false;
        }
    }

    private int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
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