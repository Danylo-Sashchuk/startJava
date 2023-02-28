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
        setUp();
        while (hasAttempts(player2)) {
            if (isGuessed(makeMove(player1))) {
                printCongratulations(player1);
                printAttempts(player1, player2);
                return;
            }
            hasAttempts(player1);
            if (isGuessed(makeMove(player2))) {
                printCongratulations(player2);
                printAttempts(player2, player1);
                return;
            }
        }
        System.out.println("Никто из игроков не угадал число!");
        printAttempts(player1, player2);
    }

    private void setUp() {
        generateTargetNumber();
        player1.clearAttempts();
        player2.clearAttempts();
    }

    private void generateTargetNumber() {
        Random rand = new Random();
        targetNumber = rand.nextInt(100) + 1;
    }

    private boolean hasAttempts(Player player) {
        if (player.getCountAttempts() == Player.ATTEMPTS_LIMIT) {
            System.out.println("У " + player.getName() + " закончились попытки.");
            return false;
        }
        return true;
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

    private int makeMove(Player player) {
        int playerNumber = inputNumber(player);
        player.addNumber(playerNumber);
        return playerNumber;
    }

    private void printCongratulations(Player winner) {
        System.out.println("\nПоздравляем! " + winner.getName() + ", вы угадали " + targetNumber +
                " с " + winner.getCountAttempts() + " попытки!");
    }

    private void printAttempts(Player player1, Player player2) {
        System.out.println(player1.getName() + ", вот ваши числа:");
        printArray(player1.getAttempts());
        System.out.println(player2.getName() + ", а вот ваши:");
        printArray(player2.getAttempts());
    }

    private void printArray(int[] attempts) {
        for (int attempt : attempts) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }
}
