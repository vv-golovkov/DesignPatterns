package com.home.designpatterns.behavioral.observer.version1;

import com.home.designpatterns.behavioral.observer.version1.code.Customer1;
import com.home.designpatterns.behavioral.observer.version1.code.Customer2;
import com.home.designpatterns.behavioral.observer.version1.code.WeatherObserver;
import com.home.designpatterns.behavioral.observer.version1.code.WeatherStation;

public class Launcher {
    
    public static void main(String[] args) {
        WeatherObserver customer1 = new Customer1();
        WeatherObserver customer2 = new Customer2();
        
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(customer1);
        weatherStation.addObserver(customer2);
        
        weatherStation.setTemperature(12.3);
        weatherStation.setTemperature(16.9);
    }
}
