package com.home.designpatterns.structural.proxy.code;

public class FolderProxy implements IFolder {
    private IFolder folder;
    private User user;

    public FolderProxy(User user) {
        this.user = user;
        System.out.println("Proxy has instantiated OK.");
    }

    @Override
    public void performOperations() {
        if (user != null) {
            String username = user.getName();
            String password = user.getPassword();
            String defAccess = User.DEFAULT_USER_PASS;
            if (defAccess.equalsIgnoreCase(username) && defAccess.equalsIgnoreCase(password)) {
                folder = new Folder();
                System.out.println("Proxy is delegating method executing to Folder...Ok");
                folder.performOperations();
            } else {
                System.out.println("You don't have access to this folder.");
            }
        }
    }
}
