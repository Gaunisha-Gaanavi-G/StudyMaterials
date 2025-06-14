package org.example.AbstractFactory;

public class BikeFactory extends VehicleAbstractFactory{
    @Override
    public Vehicle createVehicle(String size) {
        Bike bike = null;
        if(size.equalsIgnoreCase("mega"))
            bike = new MegaBike();
        else if (size.equalsIgnoreCase("micro")) {
            bike = new MicroBike();
        }
        return bike;
    }
}
