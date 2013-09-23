package com.home.designpatterns.creational.builder.version1.code;

public abstract class Builder {
    private House house;

    public House getHouse() {
        return house;
    }

    protected House newHouse(double length, double width, double height) {
        return house = new House(length, width, height);
    }

    public abstract void createHouse();
}
