package org.example.AbstractFactory;

public class MicroBike extends Bike {
    public MicroBike() {
        super.setVehicleSize("Microbike");
        super.setPrice(100);
    }

    @Override
    void someCommonMethodForBike() {
        System.out.println("Specific implementation of Micro bike");
    }
}
