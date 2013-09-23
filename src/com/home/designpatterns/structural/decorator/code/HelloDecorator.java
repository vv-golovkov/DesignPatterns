package com.home.designpatterns.structural.decorator.code;

public class HelloDecorator extends Decorator {

    public HelloDecorator(StringComponent stringComponent) {
        super(stringComponent);
    }
    
    @Override
    protected String getDecoratorString() {
        return "Hello";
    }
}
