package com.home.designpatterns.creational.factorymethod.version2.code;

import com.home.designpatterns.creational.factorymethod.version1.code.Car;
import com.home.designpatterns.creational.factorymethod.version1.code.Vehicle;

public class CarDriver extends VehicleDriver {

    @Override
    Vehicle newVehicle() {
        return new Car();
    }
}
