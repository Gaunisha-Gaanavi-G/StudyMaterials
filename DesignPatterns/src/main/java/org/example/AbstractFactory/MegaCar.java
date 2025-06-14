package org.example.AbstractFactory;

public class MegaCar extends Car {
    public MegaCar() {
        super.setVehicleSize("Mega Car");
        super.setPrice(1000);
    }

    @Override
    void someCommonMethodForCar() {
        System.out.println("Specific implementation of Mega Car");
    }
}
