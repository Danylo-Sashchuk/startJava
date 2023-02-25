package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("\tУ каждого игрока по " + Player.ATTEMPTS_LIMIT + " попыток.");
        System.out.print("Первый игрок, введите свое имя: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Второй игрок, теперь вы: ");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessGame = new GuessNumber(player1, player2);
        do {
            guessGame.start();
        } while (isNext());
        System.out.println("Хорошего дня!");
    }

    private static boolean isNext() {
        char answer = 0;
        while (answer != 'y' && answer != 'n') {
            System.out.println("\nХотите продолжить игру? [y/n]:");
            answer = scan.nextLine().charAt(0);
        }
        return answer == 'y';
    }
}