package com.home.designpatterns.structural.bridge;

import com.home.designpatterns.structural.bridge.code.BlueColor;
import com.home.designpatterns.structural.bridge.code.Circle;
import com.home.designpatterns.structural.bridge.code.Rectangle;
import com.home.designpatterns.structural.bridge.code.RedColor;
import com.home.designpatterns.structural.bridge.code.Shape;

public class Launcher {
    
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColor());
        circle.colorIt();
        
        Shape rectangle = new Rectangle(new BlueColor());
        rectangle.colorIt();
    }
}
