package com.home.designpatterns.creational.abstractfactory.code;

import com.home.designpatterns.creational.abstractfactory.code.product1.Meat;
import com.home.designpatterns.creational.abstractfactory.code.product2.Sousage;

public abstract class AbstractMeatFactory {
    public abstract Meat produceMeat();
    public abstract Sousage produceSousage();
}
