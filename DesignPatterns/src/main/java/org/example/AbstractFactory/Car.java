package org.example.AbstractFactory;

public class Car implements Vehicle {
    String vehicleSize;
    double price;

    @Override
    public void setVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getVehicleSize() {
        return this.vehicleSize;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    void someCommonMethodForCar() {
        System.out.println("common method for car");
    }
}
