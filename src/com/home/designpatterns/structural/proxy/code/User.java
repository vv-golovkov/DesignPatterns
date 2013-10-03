package com.home.designpatterns.structural.proxy.code;

public class User {
    public static final String DEFAULT_USER_PASS = "admin";
    private final String name;
    private final String password;
    
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }
}
