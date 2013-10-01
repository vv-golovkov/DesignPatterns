package com.home.designpatterns.behavioral.mediator.code;

public abstract class User {
    protected final IUserMediator userMediator;
    private final String userName;
    
    public User(IUserMediator userMediator, String userName) {
        this.userMediator = userMediator;
        this.userName = userName;
    }
    
    protected String getUserName() {
        return userName;
    }
    
    public abstract void send(String message);
    public abstract void send(String message, User toUser);
    
    abstract void receiveFrom(String message, User user);
}
