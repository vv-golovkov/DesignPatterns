package com.home.designpatterns.behavioral.observer.version1.code;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements WeatherSubject {
    private Set<WeatherObserver> weatherObservers;
    
    public WeatherStation() {
        weatherObservers = new HashSet<WeatherObserver>();
    }
    
    public void setTemperature(double temperature) {
        doNotify(temperature);
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    @Override
    public void doNotify(double temperature) {
        for (WeatherObserver observer : weatherObservers) {
            observer.doUpdate(temperature);
        }
    }
}
