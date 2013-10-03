package com.home.designpatterns.behavioral.command.code;

public class TurnOffLightCommand implements Command {
    private Light light;
    
    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
