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

    private void printPlayersOrder() {
        System.out.println("Жребий брошен. Порядок угадывания числа таков:");
        for (int i = 0; i < players.length; i++) {
            System.out.println(i + 1 + ") " + players[i].getName());
        }
    }

    public void start() {
        System.out.println("\tУ каждого игрока по " + Player.ATTEMPTS_LIMIT + " попыток.");
        for (int i = 0; i < ROUNDS_LIMIT; i++) {
            playRound();
        }
        findWinner();
        resetPlayersWins();
    }

    private void resetPlayersWins() {
        for (Player player : players) {
            player.resetWins();
        }
    }

    private void playRound() {
        setUp();
        for (int j = 0; j < Player.ATTEMPTS_LIMIT; j++) {
            for (Player player : players) {
                if (makeMove(player)) {
                    player.addWin();
                    return;
                }
                if (!player.hasAttempts()) {
                    System.out.println("У игрока " + player.getName() + " закончились попытки.");
                }
            }
        }
        System.out.println("Никто из игроков не угадал число!");
        printAttempts();
    }

    private void setUp() {
        generateTargetNumber();
        for (Player player : players) {
            player.clearAttempts();
        }
        System.out.println("Число загадано, угадайте его!");
    }

    private void generateTargetNumber() {
        Random r = new Random();
        targetNumber = r.nextInt(100) + 1;
        targetNumber = 50;
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        return isGuessed(player);
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
        if (playerNumber == targetNumber) {
            System.out.println("\nПоздравляем! " + player.getName() + ", вы угадали " + targetNumber + " с " + player.getCountAttempts() + " попытки!");
            printAttempts(players);
            return true;
        }
        System.out.println(playerNumber < targetNumber ? "Число " + playerNumber + " меньше того, что загадал компьютер." : "Число " + playerNumber + " больше того, что загадал компьютер.");
        return false;
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

    private void printAttempts(Player... players) {
        for (Player player : players) {
            System.out.println(player.getName() + ", вот ваши числа:");
            for (int attempt : player.getAttempts()) {
                System.out.print(attempt + " ");
            }
            System.out.println();
        }
    }

    private void findWinner() {
        Player[] winners = new Player[players.length];
        winners[0] = players[0];
        int winnersCounter = 1;
        for (int i = 1; i < players.length; i++) {
            if (players[i].getCountWins() > winners[0].getCountWins()) {
                winners[0] = players[i];
                winnersCounter = 1;
            } else if (players[i].getCountWins() == winners[0].getCountWins()) {
                winners[winnersCounter++] = players[i];
            }
        }
        printCongratulation(winners, winnersCounter);
    }

    private void printCongratulation(Player[] winners, int winnersCounter) {
        if (winnersCounter == 1) {
            System.out.println("По итогам " + ROUNDS_LIMIT + " раундов победитель - " + winners[0].getName());
            System.out.println("Поздравляем!");
        } else if (winnersCounter > 1) {
            if (winners[0].getCountWins() == 0) {
                System.out.println("Упс, никто не победил.");
            } else {
                System.out.println("Ух ты, у нас несколько победителей!");
                System.out.print("Поздравляем:");
                for (int i = 0; i < winnersCounter; i++) {
                    System.out.print(" " + winners[i].getName());
                }
                System.out.println("!");
            }
        }
    }
}
