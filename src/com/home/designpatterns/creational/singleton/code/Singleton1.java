package com.home.designpatterns.creational.singleton.code;

public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {}

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    @Override
    public String toString() {
        return String.format("-%s [HASH_CODE=%d]", getClass().getSimpleName(), instance.hashCode());
    }
}
