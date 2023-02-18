package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.print("\tПриветствую!\nПервый игрок, введите свое имя: ");
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
        while (true) {
            System.out.println("Хотите продолжить игру? [y/n]:");
            char answer = scan.nextLine().charAt(0);
            if (answer == 'y') {
                return true;
            }
            if (answer == 'n') {
                return false;
            }
        }
    }
}