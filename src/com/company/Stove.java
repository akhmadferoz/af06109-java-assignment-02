package com.company;

public class Stove extends Appliance {
    private int units;

    Stove() { this.units = RandomGenerator.generateRandomNumber(); }

    public void showDetails() {
        System.out.println("Stove units: " + this.units + " units");
        super.showDetails();
    }
}
