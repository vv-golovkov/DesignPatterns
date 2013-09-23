package com.home.designpatterns.behavioral.state.code;

//sharik kuplen
public class SoldState implements State {
    
    @Override
    public void insertQuarter() {
        System.out.println("insertQuarter: Please wait... We've already giving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("ejectQuarter: Sorry, you already turned the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("turnCrank: Turning twice doesn't get you another gumball.");
    }

    @Override
    public void dispense() {
        System.out.println("dispense: Please wait... We've already giving you a gumball.");
    }
}
