package com.home.designpatterns.behavioral.state.code;

public class GumballMachine {
    private int numberGumballs;
    private State currentState;
    
    public GumballMachine(int numberGumballs) {
        this.numberGumballs = numberGumballs;
        currentState = (numberGumballs > 0) ? new NoQuarterState() : new SoldOutState();
    }
}
