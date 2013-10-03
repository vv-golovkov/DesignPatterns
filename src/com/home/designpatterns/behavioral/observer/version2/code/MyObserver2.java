package com.home.designpatterns.behavioral.observer.version2.code;

import java.util.Observable;
import java.util.Observer;

public class MyObserver2 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update(" + o.getClass().getSimpleName() + "," + arg + ");");
    }
}
