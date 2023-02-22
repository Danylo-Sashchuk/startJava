package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scan;
    private static GuessNumber guessGame;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("\tУ каждого игрока по " + Player.ATTEMPTS_LIMIT + " попыток.");
        System.out.print("Первый игрок, введите свое имя: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Второй игрок, теперь вы: ");
        Player player2 = new Player(scan.nextLine());
        guessGame = new GuessNumber(player1, player2);
        startOver();
        System.out.println("Хорошего дня!");
    }

    private static void startOver() {
        guessGame.start();
        isNext();
    }

    private static void isNext() {
        System.out.println("Хотите продолжить игру? [y/n]:");
        char answer = scan.nextLine().charAt(0);
        if (answer == 'y') {
            startOver();
        } else if (answer != 'n') {
            isNext();
        }
    }
}