package com.home.designpatterns.structural.bridge.code;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }
    
    @Override
    public void colorIt() {
        System.out.print("Circle filled with ");
        color.fill();
    }
}
