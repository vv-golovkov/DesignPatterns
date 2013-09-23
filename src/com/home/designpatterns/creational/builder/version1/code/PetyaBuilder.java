package com.home.designpatterns.creational.builder.version1.code;

public class PetyaBuilder extends Builder {

    @Override
    public void createHouse() {
        newHouse(1.2, 1.3, 1.4);
        System.out.println("Building house by Petya...");
    }
}
