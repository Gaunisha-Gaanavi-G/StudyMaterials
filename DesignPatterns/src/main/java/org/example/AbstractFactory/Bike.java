package org.example.AbstractFactory;

public class Bike implements Vehicle {
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
    void someCommonMethodForBike() {
        System.out.println("Some common method for Bike.");
    }
}
