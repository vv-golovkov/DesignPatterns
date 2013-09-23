package com.home.designpatterns.structural.decorator;

import com.home.designpatterns.structural.decorator.code.EndComponent;
import com.home.designpatterns.structural.decorator.code.HelloDecorator;
import com.home.designpatterns.structural.decorator.code.SpaceDecorator;
import com.home.designpatterns.structural.decorator.code.StringComponent;
import com.home.designpatterns.structural.decorator.code.WorldDecorator;

public class Launcher {

    public static void main(String[] args) {
        StringComponent stringComponent = new HelloDecorator(new SpaceDecorator(new WorldDecorator(new EndComponent())));
        System.out.println(stringComponent.getString());
    }
}
