package com.home.designpatterns.creational.factorymethod.version1.code;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println(String.format("Starting a car [%d]...", hashCode()));
    }

    @Override
    public void stop() {
        System.out.println(String.format("Stopping a car [%d]...", hashCode()));
    }
}
