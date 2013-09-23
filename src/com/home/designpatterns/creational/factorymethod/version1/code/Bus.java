package com.home.designpatterns.creational.factorymethod.version1.code;

public class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println(String.format("Starting a bus [%d]...", hashCode()));
    }

    @Override
    public void stop() {
        System.out.println(String.format("Stopping a bus [%d]...", hashCode()));
    }
}
