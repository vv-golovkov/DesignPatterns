package com.home.designpatterns.behavioral.command.code;

public class TurnOnLightCommand implements Command {
    private Light light;
    
    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
