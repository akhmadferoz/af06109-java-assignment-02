package com.company;

public class LEDLight extends Appliance {
    private int illumination;

    LEDLight() { this.illumination = RandomGenerator.generateRandomNumber(); }

    public void showDetails() {
        System.out.println("LED Light illumination: " + this.illumination + " lumens");
        super.showDetails();
    }
}
