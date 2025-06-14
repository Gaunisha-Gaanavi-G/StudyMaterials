package org.example.AbstractFactory;

public class MainShowroom {
    public void createVehicle(String vehicleType, String vehicleSize){
        Vehicle vehicle = null;
        if(vehicleType.equalsIgnoreCase("Bike")){
            vehicle = new BikeFactory().createVehicle(vehicleSize);
        }
        else if(vehicleType.equalsIgnoreCase("Car")){
            vehicle = new CarFactory().createVehicle(vehicleSize);
        }
        if(vehicle!=null) System.out.println(vehicle.getVehicleSize()+" "+vehicle.getPrice());
        else System.out.println("No vehicle found");
    }
}
