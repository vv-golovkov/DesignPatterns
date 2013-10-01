package com.home.designpatterns.behavioral.visitor.code.city;

public class Museum implements CityElement {

    @Override
    public void accept(CityVisitor visitor) {
        System.out.println("Museum is accepting a visitor.");
        visitor.visit(this);
    }
}
