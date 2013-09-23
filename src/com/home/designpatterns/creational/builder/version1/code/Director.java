package com.home.designpatterns.creational.builder.version1.code;

public class Director {
    private Builder builder;
    
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    public House buildHouse() {
        builder.createHouse();
        return builder.getHouse();
    }
}
