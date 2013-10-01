package com.home.designpatterns.structural.bridge.code;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }
    
    @Override
    public void colorIt() {
        System.out.print("Rectangle filled with ");
        color.fill();
    }
}
