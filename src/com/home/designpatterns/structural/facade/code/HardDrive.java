package com.home.designpatterns.structural.facade.code;

public class HardDrive {
    
    public byte[] read(long lba, int size) {
        System.out.println("Hard drive is reading... " + lba + ", " + size + ";");
        return new byte[] {2,3,4};
    }
}
