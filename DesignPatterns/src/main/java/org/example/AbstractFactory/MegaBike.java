package org.example.AbstractFactory;

public class MegaBike extends Bike {
    public MegaBike() {
        super.setVehicleSize("Mega Bike");
        super.setPrice(500);
    }

    @Override
    void someCommonMethodForBike() {
        System.out.println("Specific implementation of Mega Bike");
    }
}
