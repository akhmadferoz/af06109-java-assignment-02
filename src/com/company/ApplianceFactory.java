package com.company;

public class ApplianceFactory {
    Appliance createAppliance(String type){
        if (type.equals("Fridge")){
            return new Fridge();
        }
        if (type.equals("Computer")){
            return new Computer();
        }
        if (type.equals("LEDLight")){
            return new LEDLight();
        }
        if (type.equals("Stove")){
            return new Stove();
        }

        return new Appliance();
    }
}
