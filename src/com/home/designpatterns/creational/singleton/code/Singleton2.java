package com.home.designpatterns.creational.singleton.code;

public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return String.format("-%s [HASH_CODE=%d]", getClass().getSimpleName(), instance.hashCode());
    }
}
