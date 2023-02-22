package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        generateTargetNumber();
        while (true) {
            int playerNumber = inputNumber(player1);
            player1.makeAttempt(playerNumber);
            if (isGuessed(playerNumber)) {
                printCongratulations(player1, player2);
                return;
            }
            player1.incrementAttemptsCounter();
            areAttemptsLeft(player1);
            playerNumber = inputNumber(player2);
            player2.makeAttempt(playerNumber);
            if (isGuessed(playerNumber)) {
                printCongratulations(player2, player1);
                return;
            }
            player2.incrementAttemptsCounter();
            if (!areAttemptsLeft(player2)) {
                System.out.println("Никто из игроков не угадал число!");
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

    private void printAttempts(int[] attempts) {
        for (int attempt : attempts) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }

    private void printCongratulations(Player winner, Player loser) {
        System.out.println("Поздравляем! " + winner.getName() + ", вы угадали " + targetNumber +
                " с " + winner.getAttemptsCounter() + " попытки!");
        System.out.println("Вот ваши введенные числа: ");
        printAttempts(winner.getAttempts());
        System.out.println("А вот числа " + loser.getName() + ": ");
        printAttempts(loser.getAttempts());
    }

    private boolean areAttemptsLeft(Player player) {
        if (player.getAttemptsCounter() == Player.ATTEMPTS_LIMIT) {
            System.out.println("У " + player.getName() + " закончились попытки.");
            return false;
        }
        return true;
    }
}
