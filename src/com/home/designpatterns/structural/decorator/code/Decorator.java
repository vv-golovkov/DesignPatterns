package com.home.designpatterns.structural.decorator.code;

public abstract class Decorator implements StringComponent {
    private StringComponent stringComponent;
    
    public Decorator(StringComponent stringComponent) {
        this.stringComponent = stringComponent;
    }
    
    @Override
    public String getString() {
        return getDecoratorString() + stringComponent.getString();
    }
    
    protected abstract String getDecoratorString();
}
