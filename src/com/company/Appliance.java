package com.company;

public class Appliance implements Movable {
    public Dimension dim = new Dimension();
    public int voltage;
    public String applianceName;

    Appliance() {
        applianceName = "";
        voltage = RandomGenerator.generateRandomNumber();
    }

    void showDetails() {
        System.out.print("Dimensions: ");
        this.dim.showDetails();
    }

    @Override
    public void move() {
        System.out.println("Appliance: " + applianceName);
    }
}
