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
        prepareGame();
        while (areAttemptsLeft(players[players.length - 1])) {
            for (Player player : players) {
                makeMove(player);
                if (isGuessed(player.getLastAttempt())) {
                    printCongratulations(player);
                    printAttempts(players);
                    return;
                }
                areAttemptsLeft(player);
            }
        }
        System.out.println("Никто из игроков не угадал число!");
        printAttempts(players);
    }

    private void prepareGame() {
        generateTargetNumber();
        for (Player player : players) {
            player.reset();
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
        System.out.println(playerNumber < targetNumber ? "Число " + playerNumber + " меньше того, что загадал компьютер." :
                playerNumber > targetNumber ? "Число " + playerNumber + " больше того, что загадал компьютер." : "");
        return targetNumber == playerNumber;
    }

    private void makeMove(Player player) {
        int playerNumber = inputNumber(player);
        try {
            player.setAttempts(playerNumber);
        } catch (ArithmeticException e) {
            System.out.println("Некорретное число!\nВведите число в пределах (0, 100]:");
            makeMove(player);
        }
    }

    private void printAttempts(Player[] players) {
        for (Player player : players) {
            System.out.println(player.getName() + ", вот ваши числа:");
            printArray(player.getAttempts());
        }
    }

    private void printArray(int[] attempts) {
        for (int attempt : attempts) {
            System.out.print(attempt + " ");
        }
        System.out.println();
    }

    private void printCongratulations(Player winner) {
        System.out.println("\nПоздравляем! " + winner.getName() +
                ", вы угадали " + targetNumber + " с " + winner.getAttemptsCounter() + " попытки!");
    }

    private boolean areAttemptsLeft(Player player) {
        if (player.getAttemptsCounter() == Player.ATTEMPTS_LIMIT) {
            System.out.println("У " + player.getName() + " закончились попытки.");
            return false;
        }
        return true;
    }
}
