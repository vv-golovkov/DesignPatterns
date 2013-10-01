package com.home.designpatterns.behavioral.visitor.code.city;

import com.home.designpatterns.behavioral.visitor.code.Visitor;

public class CityVisitor implements Visitor {

    @Override
    public void visit(Park park) {
        System.out.println("I'm visiting the park...");
    }

    @Override
    public void visit(Museum museum) {
        System.out.println("I'm visiting the museum...");
    }
}
