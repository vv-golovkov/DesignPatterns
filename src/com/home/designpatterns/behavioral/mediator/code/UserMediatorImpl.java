package com.home.designpatterns.behavioral.mediator.code;

import java.util.ArrayList;
import java.util.List;

public class UserMediatorImpl implements IUserMediator {
    private List<User> users;
    
    public UserMediatorImpl() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMesageToAll(String message, User fromUser) {
        for (User u : users) {
            if (!u.equals(fromUser)) {
                u.receiveFrom(message, fromUser);
            }
        }
    }

    @Override
    public void sendMesage(String message, User fromUser, User toUser) {
        toUser.receiveFrom(message, fromUser);
    }
}
