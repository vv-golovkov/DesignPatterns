package com.home.designpatterns.behavioral.mediator.code;

public interface IUserMediator {
    public void addUser(User user);
    
    public void sendMesageToAll(String message, User fromUser);
    public void sendMesage(String message, User fromUser, User toUser);
}
