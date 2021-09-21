package com.company;

public class Dimension {
    private final int length, width, height;

    Dimension() {
        this.length = RandomGenerator.generateRandomNumber();
        this.width = RandomGenerator.generateRandomNumber();
        this.height = RandomGenerator.generateRandomNumber();
    }

    void showDetails() {
        System.out.println("Length: " + this.length + " cm Width: " + this.width + " cm Height: " + this.height + " cm\n");
    }
}
