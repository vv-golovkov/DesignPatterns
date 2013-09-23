package com.home.designpatterns.creational.factorymethod.version2;

import com.home.designpatterns.creational.factorymethod.version2.code.BusDriver;
import com.home.designpatterns.creational.factorymethod.version2.code.CarDriver;
import com.home.designpatterns.creational.factorymethod.version2.code.VehicleDriver;

public class Launcher {
    
    public static void main(String[] args) {
        VehicleDriver carDriver = new CarDriver();
        carDriver.startVehicle();
        carDriver.stopVehicle();
        
        VehicleDriver busDriver = new BusDriver();
        busDriver.startVehicle();
        busDriver.stopVehicle();
    }
}
