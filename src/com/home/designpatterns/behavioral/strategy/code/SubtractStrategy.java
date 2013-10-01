package com.home.designpatterns.behavioral.strategy.code;

public class SubtractStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Called SubtractStrategy executing...");
        return a - b;
    }
}
