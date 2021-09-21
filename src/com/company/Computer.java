package com.company;

public class Computer extends Appliance {
    private int CPUFrequency;

    Computer() { this.CPUFrequency = RandomGenerator.generateRandomNumber(); }

    public void showDetails() {
        System.out.println("Computer CPU frequency: " + this.CPUFrequency + " MHz");
        super.showDetails();
    }
}
