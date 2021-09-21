package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ApplianceFactory factory = new ApplianceFactory();


        ArrayList<Appliance> appliances = new ArrayList<>();

        appliances.add(factory.createAppliance("Fridge"));
        appliances.add(factory.createAppliance("Stove"));
        appliances.add(factory.createAppliance("LEDLight"));
        appliances.add(factory.createAppliance("Computer"));

        Iterator<Appliance> iterator = appliances.iterator();

        while(iterator.hasNext()){
            Appliance appliance = iterator.next();
            appliance.showDetails();
        }
    }
}
