package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Первый игрок, введите свое имя: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Второй игрок, теперь вы: ");
        Player player2 = new Player(scan.nextLine());
        System.out.print("И, наконец, третий игрок, введите ваше имя: ");
        Player player3 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2, player3);
        do {
            game.start();
        } while (isNext(scan));
        System.out.println("Хорошего дня!");
    }

    private static boolean isNext(Scanner scan) {
        char answer;
        do {
            System.out.println("Хотите продолжить игру? [y/n]:");
            answer = scan.nextLine().charAt(0);
        } while (answer != 'y' && answer != 'n');
        return answer == 'y';
    }
}