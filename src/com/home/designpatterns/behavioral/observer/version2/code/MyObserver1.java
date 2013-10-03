package com.home.designpatterns.behavioral.observer.version2.code;

import java.util.Observable;
import java.util.Observer;

public class MyObserver1 implements Observer {

    //o - Observable object that changed his own state.
    //agr - argument that was changed within Observable object.
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update(" + o.getClass().getSimpleName() + "," + arg + ");");
    }
}
