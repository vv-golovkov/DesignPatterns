package com.home.designpatterns.creational.builder.version1.code;

public class VasyaBuilder extends Builder {

    @Override
    public void createHouse() {
        newHouse(2.2, 2.3, 2.4);
        System.out.println("Building house by Vasya...");
    }
}
