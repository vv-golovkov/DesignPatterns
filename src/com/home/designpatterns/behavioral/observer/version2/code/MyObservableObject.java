package com.home.designpatterns.behavioral.observer.version2.code;

import java.util.Observable;

public class MyObservableObject extends Observable {
    
    public void changeSomething(String newStirng) {
        setChanged();
        notifyObservers(newStirng);
    }
}
