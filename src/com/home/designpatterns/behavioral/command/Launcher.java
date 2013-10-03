package com.home.designpatterns.behavioral.command;

import com.home.designpatterns.behavioral.command.code.Light;
import com.home.designpatterns.behavioral.command.code.CommandHandler;
import com.home.designpatterns.behavioral.command.code.TurnOffLightCommand;
import com.home.designpatterns.behavioral.command.code.TurnOnLightCommand;

public class Launcher {
    
    public static void main(String[] args) {
        Light light = new Light();
        
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);
        
        CommandHandler commandHandler = new CommandHandler(turnOnLightCommand, turnOffLightCommand);
        commandHandler.executeTurnOnLightCommand();
        commandHandler.executeTurnOffLightCommand();
    }
}
