package com.home.designpatterns.behavioral.state.code;

public class NoQuarterState implements State {

    @Override
    public void insertQuarter() {
        System.out.println("insertQuarter: You inserted a quarter.");
        //go to HasQuarterState
    }

    @Override
    public void ejectQuarter() {
        System.out.println("ejectQuarter: You haven't inserted a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("turnCrank: There is no quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("dispense: You need to pay first.");
    }
}
