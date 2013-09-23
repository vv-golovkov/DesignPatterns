package com.home.designpatterns.structural.decorator.code;

public class WorldDecorator extends Decorator {

    public WorldDecorator(StringComponent stringComponent) {
        super(stringComponent);
    }
    
    @Override
    protected String getDecoratorString() {
        return "World";
    }
}
