package com.home.designpatterns.behavioral.templatemethod;

import com.home.designpatterns.behavioral.templatemethod.code.AbstractClass;
import com.home.designpatterns.behavioral.templatemethod.code.ConcreteClassA;
import com.home.designpatterns.behavioral.templatemethod.code.ConcreteClassB;

public class Launcher {
    
    public static void main(String[] args) {
        AbstractClass clazzA = new ConcreteClassA();
        clazzA.doAction();
        
        System.out.println("-------------------------------------");
        
        AbstractClass clazzB = new ConcreteClassB();
        clazzB.doAction();
    }
}
