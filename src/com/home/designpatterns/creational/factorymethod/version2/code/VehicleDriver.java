package com.home.designpatterns.creational.factorymethod.version2.code;

import com.home.designpatterns.creational.factorymethod.version1.code.Vehicle;

public abstract class VehicleDriver {
    private Vehicle vehicle;
    
    public void startVehicle() {
        getVehicle().start();
    }
    
    public void stopVehicle() {
        getVehicle().stop();
    }
    
    public Vehicle getVehicle() {
        if (vehicle == null) {
            vehicle = newVehicle();
        }
        return vehicle;
    }

    //factory method
    abstract Vehicle newVehicle();
}
