package com.home.designpatterns.behavioral.observer.version1.code;

public class Customer2 implements WeatherObserver {

    @Override
    public void doUpdate(double temperature) {
        System.out.println(String.format("%s provided with new temperature [%f]", getClass().getSimpleName(), temperature));
    }
}
