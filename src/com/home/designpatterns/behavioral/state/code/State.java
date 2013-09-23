package com.home.designpatterns.behavioral.state.code;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();//razdat, osvobodit
}
