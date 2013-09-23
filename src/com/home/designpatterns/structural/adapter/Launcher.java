package com.home.designpatterns.structural.adapter;

import com.home.designpatterns.structural.adapter.code.Duck;
import com.home.designpatterns.structural.adapter.code.TurkeyAdapter;
import com.home.designpatterns.structural.adapter.code.WildTurkey;

public class Launcher {
    
    public static void main(String[] args) {
        Duck wildTurkeyAdapter = new TurkeyAdapter(new WildTurkey());
        wildTurkeyAdapter.quack();
        wildTurkeyAdapter.fly();
    }
}
