package com.home.designpatterns.behavioral.mediator.code;

public class UserImpl extends User {

    public UserImpl(IUserMediator userMediator, String userName) {
        super(userMediator, userName);
    }

    @Override
    public void send(String message) {
        userMediator.sendMesageToAll(message, this);
    }
    
    @Override
    public void send(String message, User toUser) {
        userMediator.sendMesage(message, this, toUser);
    }

    @Override
    public void receiveFrom(String message, User user) {
        System.out.println(String.format("From [%s] to [%s]: %s", user.getUserName(), getUserName(), message));
    }
}
