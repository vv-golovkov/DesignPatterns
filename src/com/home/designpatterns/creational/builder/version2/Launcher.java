package com.home.designpatterns.creational.builder.version2;

import com.home.designpatterns.creational.builder.version2.code.OuterObject;

public class Launcher {
    
    public static void main(String[] args) {
        OuterObject outerObject = new OuterObject.Builder(55, 66).setOptionalVar1(77).build();
        System.out.println(outerObject);
    }
}
