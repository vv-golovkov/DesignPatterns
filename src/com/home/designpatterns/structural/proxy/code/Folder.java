package com.home.designpatterns.structural.proxy.code;

public class Folder implements IFolder {

    @Override
    public void performOperations() {
        System.out.println("Performing operation on folder...Ok");
    }
}
