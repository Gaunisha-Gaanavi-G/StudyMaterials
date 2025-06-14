package org.example.AbstractFactory;

public class MicroCar extends Car {
    public MicroCar() {
        super.setVehicleSize("Micro Car");
        super.setPrice(2000);
    }

    @Override
    void someCommonMethodForCar() {
        System.out.println("Specific implementation of Micro Car");
    }
}
