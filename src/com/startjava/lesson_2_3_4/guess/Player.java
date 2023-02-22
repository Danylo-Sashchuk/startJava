package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    static final int ATTEMPTS_LIMIT = 10;
    private String name;
    private int[] attempts;
    private int attemptsCounter;

    public Player(String name) {
        this.name = name;
        attempts = new int[ATTEMPTS_LIMIT];
        attemptsCounter = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, attemptsCounter);
    }

    public void addNumber(int number) {
        attempts[attemptsCounter] = number;
    }

    public int getAttemptsCounter() {
        return attemptsCounter;
    }

    public void incrementAttemptsCounter() {
        attemptsCounter++;
    }

    public void reset() {
        Arrays.fill(attempts, 0, attemptsCounter, 0);
        attemptsCounter = 0;
    }
}