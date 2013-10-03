package com.home.designpatterns.behavioral.command.code;

public class CommandHandler {
    private TurnOnLightCommand turnOnLightCommand;
    private TurnOffLightCommand turnOffLightCommand;
    
    public CommandHandler(TurnOnLightCommand turnOnLightCommand, TurnOffLightCommand turnOffLightCommand) {
        this.turnOnLightCommand = turnOnLightCommand;
        this.turnOffLightCommand = turnOffLightCommand;
    }
    
    public void executeTurnOnLightCommand() {
        turnOnLightCommand.execute();
    }
    
    public void executeTurnOffLightCommand() {
        turnOffLightCommand.execute();
    }
}
