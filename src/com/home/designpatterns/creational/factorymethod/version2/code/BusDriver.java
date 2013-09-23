package com.home.designpatterns.creational.factorymethod.version2.code;

import com.home.designpatterns.creational.factorymethod.version1.code.Bus;
import com.home.designpatterns.creational.factorymethod.version1.code.Vehicle;

public class BusDriver extends VehicleDriver {

    @Override
    Vehicle newVehicle() {
        return new Bus();
    }
}
