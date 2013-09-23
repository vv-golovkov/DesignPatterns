package com.home.designpatterns.behavioral.state.code;

public class HasQuarterState implements State {

    @Override
    public void insertQuarter() {
        System.out.println("insertQuarter: There already is a quarter. You can't insert another one.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("ejectQuarter: Quarter returned.");
        //go to NoQuarterState
    }

    @Override
    public void turnCrank() {
        System.out.println("turnCrank: You turned...");
        //go to SoldState
    }

    @Override
    public void dispense() {
        System.out.println("dispense: Quarter dispensed.");
    }
}
