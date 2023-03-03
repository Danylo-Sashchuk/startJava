package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    static final int ATTEMPTS_LIMIT = 10;
    private String name;
    private int[] attempts;
    private int countAttempts;
    private int countWins;

    public Player(String name) {
        this.name = name;
        attempts = new int[ATTEMPTS_LIMIT];
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, countAttempts);
    }

    public void setAttempt(int number) {
        if (number <= 0 || number > 100) {
            throw new RuntimeException("Incorrect number");
        }
        addNumber(number);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getCountWins() {
        return countWins;
    }

    public void addWin() {
        countWins++;
    }

    private void addNumber(int number) {
        attempts[countAttempts++] = number;
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public int getLastAttempt() {
        return attempts[countAttempts - 1];
    }
}