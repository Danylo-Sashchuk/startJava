package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;
    private int targetNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        setUp();
        while (hasAttempts(players[players.length - 1])) {
            for (Player player : players) {
                makeMove(player);
                if (isGuessed(player)) {
                    boolean isWinnerDetermined = makeMove(player);
                    if (isWinnerDetermined) {
                        return;
                    }
                }
                hasAttempts(player);
            }
            System.out.println("Никто из игроков не угадал число!");
            printAttempts();
        }
    }

    private void setUp() {
        generateTargetNumber();
        for (Player player : players) {
            player.clearAttempts();
        }
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
        try {
            player.setAttempt(scan.nextInt());
        } catch (ArithmeticException e) {
            System.out.println("Некорретное число!\nВведите число в пределах (0, 100].");
            makeMove(player);
        }
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
        for (Player player : players) {
            System.out.println(player.getName() + ", вот ваши числа:");
            for (int attempt : player.getAttempts()) {
                System.out.print(attempt + " ");
            }
            System.out.println();
        }
    }

}
