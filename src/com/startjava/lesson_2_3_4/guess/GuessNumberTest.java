package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\tУ каждого игрока по " + Player.ATTEMPTS_LIMIT + " попыток.");
//        System.out.print("Первый игрок, введите свое имя: ");
//        Player player1 = new Player(scan.nextLine());
//        System.out.print("Второй игрок, теперь вы: ");
//        Player player2 = new Player(scan.nextLine());
//        System.out.print("И, наконец, третий игрок, введите ваше имя: ");
//        Player player3 = new Player(scan.nextLine());
        Player[] rawPlayers = {new Player("1"), new Player("2"), new Player("3"), new Player("4"), new Player("5"), new Player("6"), new Player("7"), new Player("8"), new Player("9"), new Player("10")};
        Player[] players = shufflePlayers(rawPlayers);
        for (Player player :
                players) {
            System.out.print(player.getName() + ", ");
        }
        System.out.println();
        players = shufflePlayers(rawPlayers);
        for (Player player :
                players) {
            System.out.print(player.getName() + ", ");
        }
        System.out.println();
        players = shufflePlayers(rawPlayers);
        for (Player player :
                players) {
            System.out.print(player.getName() + ", ");
        }
        System.out.println();
        players = shufflePlayers(rawPlayers);
        for (Player player :
                players) {
            System.out.print(player.getName() + ", ");
        }
        System.out.println();
        players = shufflePlayers(rawPlayers);
        for (Player player :
                players) {
            System.out.print(player.getName() + ", ");
        }
//        GuessNumber game = new GuessNumber(player1, player2, player3);
//        do {
//            game.start();
//        } while (isNext(scan));
//        System.out.println("Хорошего дня!");
    }

    private static Player[] shufflePlayers(Player... players) {
        Random rand = new Random();
        for (int bound = players.length - 1; bound > 0; bound--) {
            swap(players, rand.nextInt(bound), bound);
        }
        return players;
    }

    private static void swap(Player[] players, int from, int to) {
        Player temp = players[from];
        players[from] = players[to];
        players[to] = temp;
    }

    private static boolean isNext(Scanner scan) {
        char answer;
        do {
            System.out.println("\nХотите продолжить игру? [y/n]:");
            answer = scan.nextLine().charAt(0);
        } while (answer != 'y' && answer != 'n');
        return answer == 'y';
    }
}