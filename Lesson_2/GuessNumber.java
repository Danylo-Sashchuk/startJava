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
        targetNumber = generateRandomNumber();
        while(true) {
            int firstPlayerNumber = playerTurn(firstPlayer);
            if (isGuessed(firstPlayerNumber)) {
                return firstPlayer;
            }
            int secondPlayerNumber = playerTurn(secondPlayer);
            if (isGuessed(secondPlayerNumber)) {
                return secondPlayer;
            }
        }
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; 
        return randomNumber;
    }

    private int playerTurn(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
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