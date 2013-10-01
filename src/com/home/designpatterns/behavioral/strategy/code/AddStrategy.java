package com.home.designpatterns.behavioral.strategy.code;

public class AddStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Called AddStrategy executing...");
        return a + b;
    }
}
