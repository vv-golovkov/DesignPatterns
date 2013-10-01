package com.home.designpatterns.behavioral.strategy;

import com.home.designpatterns.behavioral.strategy.code.AddStrategy;
import com.home.designpatterns.behavioral.strategy.code.Context;
import com.home.designpatterns.behavioral.strategy.code.SubtractStrategy;

public class Launcher {
    
    public static void main(String[] args) {
        Context context = new Context();
        
        context.setStrategy(new AddStrategy());
        int addResult = context.executeStrategy(9, 2);
        System.out.println(addResult);
        
        context.setStrategy(new SubtractStrategy());
        int subtractResult = context.executeStrategy(9, 2);
        System.out.println(subtractResult);
    }
}
