package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    static final int ATTEMPTS_LIMIT = 10;
    private String name;
    private int[] attempts;
    private int countAttempts;

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

    public int getCountAttempts() {
        return countAttempts;
    }

    public void addNumber(int number) {
        attempts[countAttempts++] = number;
    }

    public void clearAttempts() {
        Arrays.fill(attempts, 0, countAttempts, 0);
        countAttempts = 0;
    }
}