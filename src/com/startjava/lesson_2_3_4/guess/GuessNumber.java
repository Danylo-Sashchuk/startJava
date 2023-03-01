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
            boolean isWinnerDetermined = makeMove(player1);
            if (isWinnerDetermined) {
                return;
            }
            hasAttempts(player1);
            isWinnerDetermined = makeMove(player2);
            if (isWinnerDetermined) {
                return;
            }
        }
        System.out.println("Никто из игроков не угадал число!");
        printAttempts();
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

    private boolean makeMove(Player player) {
        inputNumber(player);
        if (isGuessed(player)) {
            printCongratulations(player);
            printAttempts();
            return true;
        }
        return false;
    }

    private void inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        player.addNumber(scan.nextInt());
    }

    private boolean isGuessed(Player player) {
        int playerNumber = player.getLastAttempt();
        if (playerNumber < targetNumber) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер.");
        } else if (playerNumber > targetNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер.");
        } else {
            return true;
        }
        return false;
    }

    private void printCongratulations(Player winner) {
        System.out.println("\nПоздравляем! " + winner.getName() + ", вы угадали " + targetNumber +
                " с " + winner.getCountAttempts() + " попытки!");
    }

    private void printAttempts() {
        System.out.println(player1.getName() + ", вот ваши числа:");
        for (int attempt : player1.getAttempts()) {
            System.out.print(attempt + " ");
        }
        System.out.println();
        System.out.println(player2.getName() + ", а вот ваши числа:");
        for (int attempt : player2.getAttempts()) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }
}
