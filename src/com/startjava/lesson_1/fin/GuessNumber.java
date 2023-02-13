package com.startjava.lesson_1.fin;

public class GuessNumber {
    public static void main(String[] args) {
        int tagretNumber = 69;
        int playerNumber = 50;
        while (playerNumber != tagretNumber) {
            if (playerNumber < tagretNumber) {
                System.out.printf("Число %d меньше того, что загадал компьютер.\n", playerNumber);
                playerNumber++;
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер.\n", playerNumber);
                playerNumber--;
            }
        }
        System.out.printf("\tВы победили! Компьютер загадал число %d!\n", tagretNumber);
    }
}