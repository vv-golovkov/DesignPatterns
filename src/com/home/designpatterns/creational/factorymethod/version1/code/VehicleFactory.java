package com.home.designpatterns.creational.factorymethod.version1.code;

public class VehicleFactory {

    //factory method
    public static Vehicle getVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
        case CAR:
            return new Car();
        case BUS:
            return new Bus();
        default:
            throw new IllegalStateException("Unsopported vehicle type.");
        }
    }
}
