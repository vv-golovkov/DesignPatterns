package com.home.designpatterns.structural.facade.code;

public class Memory {
    
    public void load(long position, byte[] data) {
        System.out.println("Memory is loading data from position... " + position + ";");
    }
}
