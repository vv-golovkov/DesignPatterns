package com.home.designpatterns.behavioral.visitor.code.city;

public class Park implements CityElement {

    @Override
    public void accept(CityVisitor visitor) {
        System.out.println("Park is accepting a visitor.");
        visitor.visit(this);
    }
}
