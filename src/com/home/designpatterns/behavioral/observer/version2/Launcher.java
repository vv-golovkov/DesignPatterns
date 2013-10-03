package com.home.designpatterns.behavioral.observer.version2;

import com.home.designpatterns.behavioral.observer.version2.code.MyObservableObject;
import com.home.designpatterns.behavioral.observer.version2.code.MyObserver1;
import com.home.designpatterns.behavioral.observer.version2.code.MyObserver2;

public class Launcher {
    
    public static void main(String[] args) {
        MyObserver1 observer1 = new MyObserver1();
        MyObserver2 observer2 = new MyObserver2();
        
        MyObservableObject observableObject = new MyObservableObject();
        observableObject.addObserver(observer1);
        observableObject.addObserver(observer2);
        
        observableObject.changeSomething("hello");
        observableObject.changeSomething("world");
    }
}
