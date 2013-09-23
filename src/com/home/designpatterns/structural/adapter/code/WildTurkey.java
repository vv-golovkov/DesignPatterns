package com.home.designpatterns.structural.adapter.code;


public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gooble, gooble...");
    }

    @Override
    public void fly() {
        System.out.println("Wild turkey is flying...");
    }
}
