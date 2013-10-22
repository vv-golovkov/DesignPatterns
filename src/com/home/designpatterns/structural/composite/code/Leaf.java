package com.home.designpatterns.structural.composite.code;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Leaf: " + name);
    }
}
