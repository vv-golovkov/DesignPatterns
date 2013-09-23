package com.home.designpatterns.structural.adapter.code;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck is flying...");
    }
}
