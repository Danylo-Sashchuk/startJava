package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;
    private int targetNumber;
    private final int ROUNDS_LIMIT = 3;

    public GuessNumber(Player... players) {
        this.players = shufflePlayers(players);
        printPlayersOrder();
    }

    private void printPlayersOrder() {
        System.out.println("Жребий брошен. Порядок угадывания числа таков:");
        for (int i = 0; i < players.length; i++) {
            System.out.println(i + 1 + ") " + players[i].getName());
        }
    }

    public void start() {
        for (int i = 0; i < ROUNDS_LIMIT; i++) {
            playRound();
        }
        findWinner();
    }

    private void playRound() {
        setUp();
        boolean isWinnerDetermined;
        for (int j = 0; j < Player.ATTEMPTS_LIMIT; j++) {
            for (Player player : players) {
                isWinnerDetermined = makeMove(player);
                if (isWinnerDetermined) {
                    player.addWin();
                    return;
                }
                hasAttempts(player);
            }
        }
        System.out.println("\nНикто из игроков не угадал число!");
        printAttempts();
    }

    private Player[] shufflePlayers(Player... players) {
        Random rand = new Random();
        for (int bound = players.length - 1; bound > 0; bound--) {
            swap(players, rand.nextInt(bound), bound);
        }
        return players;
    }

    private void swap(Player[] players, int from, int to) {
        Player temp = players[from];
        players[from] = players[to];
        players[to] = temp;
    }

    private void setUp() {
        generateTargetNumber();
        for (Player player : players) {
            player.clearAttempts();
        }
        System.out.println("Число загадано, угадайте его!");
    }

    private void generateTargetNumber() {
        Random rand = new Random();
        targetNumber = rand.nextInt(100) + 1;
        targetNumber = 50;
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
        } catch (RuntimeException e) {
            System.out.println("Некорретное число!\nВведите число в пределах (0, 100].");
            inputNumber(player);
        }
    }

    private boolean isGuessed(Player player) {
        int playerNumber = player.getLastAttempt();
        System.out.println(playerNumber < targetNumber ? "Число " + playerNumber + " меньше того, что загадал компьютер." :
                playerNumber > targetNumber ? "Число " + playerNumber + " больше того, что загадал компьютер." : "");
        return targetNumber == playerNumber;
    }

    private void printCongratulations(Player winner) {
        System.out.println("Поздравляем! " + winner.getName() + ", вы угадали " + targetNumber +
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
        System.out.println();
    }

    private void hasAttempts(Player player) {
        if (player.getCountAttempts() == Player.ATTEMPTS_LIMIT) {
            System.out.println("У " + player.getName() + " закончились попытки.");
        }
    }

    private void findWinner() {
        Player[] severalWinners = new Player[players.length];
        int winnersCounter = 1;
        severalWinners[0] = players[0];
    }
}
