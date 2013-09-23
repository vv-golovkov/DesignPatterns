package com.home.designpatterns.structural.decorator.code;

public class EndComponent implements StringComponent {

    @Override
    public String getString() {
        return ".";
    }
}
