package com.home.designpatterns.structural.facade;

import com.home.designpatterns.structural.facade.code.ComputerFacade;

public class Launcher {
    
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
}
