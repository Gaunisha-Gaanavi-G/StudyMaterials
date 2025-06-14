package org.example.AbstractFactory;

public class VehicleTest {
    public static void main(String[] args) {
        String type = "car";
        String vehicleSize="Mega";

        MainShowroom mainShowroom = new MainShowroom();
        mainShowroom.createVehicle(type, vehicleSize);

    }
}
