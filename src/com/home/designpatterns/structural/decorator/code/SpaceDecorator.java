package com.home.designpatterns.structural.decorator.code;

public class SpaceDecorator extends Decorator {

    public SpaceDecorator(StringComponent stringComponent) {
        super(stringComponent);
    }

    @Override
    protected String getDecoratorString() {
        return " ";
    }
}
