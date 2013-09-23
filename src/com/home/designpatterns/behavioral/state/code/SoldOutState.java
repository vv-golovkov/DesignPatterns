package com.home.designpatterns.behavioral.state.code;

//V avtomate net sharikov
public class SoldOutState implements State {

    @Override
    public void insertQuarter() {
        System.out.println("insertQuarter: ");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("ejectQuarter: ");
    }

    @Override
    public void turnCrank() {
        System.out.println("turnCrank: ");
    }

    @Override
    public void dispense() {
        System.out.println("dispense: ");
    }
}
