package org.example.AbstractFactory;

public class CarFactory extends VehicleAbstractFactory{

    @Override
    public Vehicle createVehicle(String size) {
        Car car = null;
        if(size.equalsIgnoreCase("micro")){
            car = new MicroCar();
        }
        else if(size.equalsIgnoreCase("mega")){
            car = new MegaCar();
        }
        return car;
    }
}
