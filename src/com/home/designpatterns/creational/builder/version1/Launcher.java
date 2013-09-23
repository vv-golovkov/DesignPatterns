package com.home.designpatterns.creational.builder.version1;

import com.home.designpatterns.creational.builder.version1.code.Director;
import com.home.designpatterns.creational.builder.version1.code.House;
import com.home.designpatterns.creational.builder.version1.code.VasyaBuilder;

public class Launcher {
    
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VasyaBuilder());
        House house = director.buildHouse();
        System.out.println(house);
    }
}
