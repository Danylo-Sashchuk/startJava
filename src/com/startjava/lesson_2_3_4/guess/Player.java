package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    static final int ATTEMPTS_LIMIT = 5;
    private final String name;
    private final int[] attempts;
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

    public int getLastAttempt() {
        return attempts[countAttempts - 1];
    }

    public void addAttempt(int number) {
        if (number <= 0 || number > 100) {
            throw new RuntimeException("Number is not in the range [0;100).");
        }
        attempts[countAttempts++] = number;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getCountWins() {
        return countWins;
    }

    public void resetWins() {
        countWins = 0;
    }

    public void incrementWin() {
        countWins++;
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public boolean hasAttempts() {
        return countAttempts != ATTEMPTS_LIMIT;
    }
}