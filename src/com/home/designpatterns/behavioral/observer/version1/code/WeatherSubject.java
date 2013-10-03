package com.home.designpatterns.behavioral.observer.version1.code;

public interface WeatherSubject {
    void addObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void doNotify(double temperature);
}
