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
            makeMove(player1);
            if (isGuessed(player1)) {
                printCongratulations(player1);
                printAttempts(player1, player2);
                return;
            }
            hasAttempts(player1);
            makeMove(player2);
            if (isGuessed(player2)) {
                printCongratulations(player2);
                printAttempts(player1, player2);
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

    private void makeMove(Player player) {
        inputNumber(player);
    }

    private void inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + ", введите число: ");
        int playerNumber = scan.nextInt();
        player.addNumber(playerNumber);
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

    private void printAttempts(Player player) {
        System.out.println(player.getName() + ", вот ваши числа:");
        for (int attempt : player.getAttempts()) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }
}
