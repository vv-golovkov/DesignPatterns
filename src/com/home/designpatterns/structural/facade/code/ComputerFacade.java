package com.home.designpatterns.structural.facade.code;

public class ComputerFacade {
    private Cpu processor;
    private Memory ram;
    private HardDrive hd;
    
    public ComputerFacade() {
        this.processor = new Cpu();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }
    
    public void start() {
        processor.freeze();
        ram.load(90, hd.read(25, 56));
        processor.jump(90);
        processor.execute();
    }
}
