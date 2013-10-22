package com.home.designpatterns.structural.composite.code;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    abstract void print();
}
