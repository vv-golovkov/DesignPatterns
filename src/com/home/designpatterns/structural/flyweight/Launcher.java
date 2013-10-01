package com.home.designpatterns.structural.flyweight;

import com.home.designpatterns.structural.flyweight.code.Circle;
import com.home.designpatterns.structural.flyweight.code.ShapeFactory;

public class Launcher {
    private static final String colors[] = { "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g",
            "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m" };

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int index = 0; index < 70; index++) {
            Circle c = (Circle) ShapeFactory.getCircle(getRandomColor());//2640 ms
            //Circle c = new Circle(getRandomColor());//7006 ms

            c.setRadius(getRandomRadius());
            c.draw();
        }

        long time = System.currentTimeMillis() - start;
        System.out.println(time + " ms");
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomRadius() {
        return (int) (Math.random() * 100);
    }
}
