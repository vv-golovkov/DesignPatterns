package com.home.designpatterns.structural.proxy;

import com.home.designpatterns.structural.proxy.code.Folder;
import com.home.designpatterns.structural.proxy.code.FolderProxy;
import com.home.designpatterns.structural.proxy.code.IFolder;
import com.home.designpatterns.structural.proxy.code.User;


public class Launcher {
    
    public static void main(String[] args) {
        IFolder folder = new Folder();
        folder.performOperations();
        System.out.println();
        
        User user = new User(User.DEFAULT_USER_PASS, User.DEFAULT_USER_PASS);
        FolderProxy folderProxy = new FolderProxy(user);
        folderProxy.performOperations();
        
    }
}
