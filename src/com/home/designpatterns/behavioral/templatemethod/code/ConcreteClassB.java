package com.home.designpatterns.behavioral.templatemethod.code;

public class ConcreteClassB extends AbstractClass {

    @Override
    public void primitiveOperation1() {
        System.out.println("ConcreteClassB: Primitive operation 1 is performing...");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("ConcreteClassB: Primitive operation 2 is performing...");
    }

    @Override
    public boolean isSupportedPrimitiveOperation2() {
        return true;
    }
}
