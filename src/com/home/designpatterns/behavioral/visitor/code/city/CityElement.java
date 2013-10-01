package com.home.designpatterns.behavioral.visitor.code.city;


public interface CityElement {
    public void accept(CityVisitor visitor);
}
