package com.home.designpatterns.structural.facade.code;

public class Cpu {
    
    public void freeze() {
        System.out.println("Cpu is freezing...");
    }
    
    public void jump(int position) {
        System.out.println("Cpu is jumping to position... " + position + ";");
    }
    
    public void execute() {
        System.out.println("Cpu is executing...");
    }
}
