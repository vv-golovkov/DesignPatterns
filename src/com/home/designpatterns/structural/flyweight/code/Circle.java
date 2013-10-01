package com.home.designpatterns.structural.flyweight.code;


public class Circle implements Shape {
    private final String color;
    private int radius;
    
    public Circle(String color) {
        this.color = color;
        
        //simulation of long creating
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing a circle with color[%s], radius[%d]...", color, radius));
    }
}
