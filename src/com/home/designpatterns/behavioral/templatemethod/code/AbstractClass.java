package com.home.designpatterns.behavioral.templatemethod.code;

public abstract class AbstractClass {
    
    //template method
    public final void doAction() {
        primitiveOperation1();
        concreteOperation();
        if (isSupportedPrimitiveOperation2()) {
            primitiveOperation2();
        }
    }
    
    abstract void primitiveOperation1();
    abstract void primitiveOperation2();
    abstract boolean isSupportedPrimitiveOperation2();
    
    private void concreteOperation() {
        System.out.println("Concrete operation is performing...");
    }
}
