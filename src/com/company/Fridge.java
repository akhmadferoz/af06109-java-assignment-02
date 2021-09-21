package com.company;

public class Fridge extends Appliance {
    private int volume;

    Fridge () { this.volume = RandomGenerator.generateRandomNumber(); }

    public void showDetails() {
        System.out.println("Fridge volume: " + this.volume + " decibels");
        super.showDetails();
    }
}
