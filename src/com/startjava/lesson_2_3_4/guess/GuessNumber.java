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
        System.out.println("\tУ каждого игрока по " + Player.ATTEMPTS_LIMIT + " попыток.");
        setUp();
        while (player2.hasAttempts()) {
            if (makeMove(player1)) {
                return;
            }
            if (player1.hasAttempts()) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки.");
            }
            if (makeMove(player2)) {
                return;
            }
        }
        System.out.println("У игрока " + player2.getName() + " закончились попытки.");
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

    private boolean makeMove(Player player) {
        inputNumber(player);
        if (isGuessed(player)) {
            printCongratulations(player);
            printAttempts(player1, player2);
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

    private void printAttempts(Player... players) {
        for (Player player : players) {
            System.out.println(player1.getName() + ", вот ваши числа:");
            for (int attempt : player.getAttempts()) {
                System.out.print(attempt + " ");
            }
            System.out.println();
        }
    }
}
