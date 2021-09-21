package com.company;

import java.util.Random;

public class RandomGenerator {
    private final static Random rand = new Random();

    static int generateRandomNumber() {
        final int upperBound = 100;
        return rand.nextInt(upperBound + 1);
    }

//    void showDetails() {
//        System.out.println("Random Number: " + generateRandomNumber());
//    }
}