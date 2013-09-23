package com.home.designpatterns.creational.factorymethod.version1;

import com.home.designpatterns.creational.factorymethod.version1.code.Vehicle;
import com.home.designpatterns.creational.factorymethod.version1.code.VehicleFactory;
import com.home.designpatterns.creational.factorymethod.version1.code.VehicleType;

public class Launcher {
    
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.CAR);
        vehicle.start();
        vehicle.stop();
    }
}
