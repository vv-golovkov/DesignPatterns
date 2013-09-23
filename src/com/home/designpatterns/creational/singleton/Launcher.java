package com.home.designpatterns.creational.singleton;

import com.home.designpatterns.creational.singleton.code.Singleton1;
import com.home.designpatterns.creational.singleton.code.Singleton2;
import com.home.designpatterns.creational.singleton.code.Singleton3;

public class Launcher {
    
    public static void main(String[] args) {
        Singleton1 testSingleton1 = Singleton1.getInstance();
        Singleton1 instanceOfSingleton1 = Singleton1.getInstance();
        System.out.println(testSingleton1);
        System.out.println(instanceOfSingleton1);
        
        System.out.println("----------------------------------");
        
        Singleton2 testSingleton2 = Singleton2.getInstance();
        Singleton2 instanceOfSingleton2 = Singleton2.getInstance();
        System.out.println(testSingleton2);
        System.out.println(instanceOfSingleton2);
        
        System.out.println("----------------------------------");
        
        Singleton3 testSingleton3 = Singleton3.getInstance();
        Singleton3 instanceOfSingleton3 = Singleton3.getInstance();
        System.out.println(testSingleton3);
        System.out.println(instanceOfSingleton3);
    }
}
