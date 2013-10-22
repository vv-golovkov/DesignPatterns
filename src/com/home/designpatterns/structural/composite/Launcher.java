package com.home.designpatterns.structural.composite;

import com.home.designpatterns.structural.composite.code.Composite;
import com.home.designpatterns.structural.composite.code.Leaf;

public class Launcher {
    
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf-1");
        Leaf leaf2 = new Leaf("Leaf-2");
        Leaf leaf3 = new Leaf("Leaf-3");
        Leaf leaf4 = new Leaf("Leaf-4");
        
        Composite composite1 = new Composite("Composite-1");
        Composite composite2 = new Composite("Composite-2");
        Composite composite3 = new Composite("Composite-3");
        
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite1.add(leaf3);
        
        composite2.add(leaf4);
        
        composite3.add(composite1);
        composite3.add(composite2);
        
        composite3.print();
    }
}
