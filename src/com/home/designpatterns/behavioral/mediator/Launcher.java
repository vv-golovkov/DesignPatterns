package com.home.designpatterns.behavioral.mediator;

import com.home.designpatterns.behavioral.mediator.code.IUserMediator;
import com.home.designpatterns.behavioral.mediator.code.User;
import com.home.designpatterns.behavioral.mediator.code.UserImpl;
import com.home.designpatterns.behavioral.mediator.code.UserMediatorImpl;

public class Launcher {
    
    public static void main(String[] args) {
        IUserMediator userMediator = new UserMediatorImpl();
        
        User user1 = new UserImpl(userMediator, "VASILIY");
        User user2 = new UserImpl(userMediator, "PETRO");
        User user3 = new UserImpl(userMediator, "IVAN");
        User user4 = new UserImpl(userMediator, "ZAXAR");
        
        userMediator.addUser(user1);
        userMediator.addUser(user2);
        userMediator.addUser(user3);
        userMediator.addUser(user4);
        
        /******************************************************/
        
        user1.send("Hi all...");
        
        user2.send("Hello, vasya)", user1);
        user1.send("Hello, petya)", user2);
        
        user4.send("Bye all...");
        
        user3.send("Bye, zaxar)", user4);
        user4.send("Bye, vano)", user3);
    }
}
