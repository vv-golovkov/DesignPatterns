package com.home.designpatterns.creational.abstractfactory.code;

import com.home.designpatterns.creational.abstractfactory.code.product1.Meat;
import com.home.designpatterns.creational.abstractfactory.code.product1.Pork;
import com.home.designpatterns.creational.abstractfactory.code.product2.PorkSousage;
import com.home.designpatterns.creational.abstractfactory.code.product2.Sousage;

public class PorkFactory extends AbstractMeatFactory {

    @Override
    public Meat produceMeat() {
        return new Pork();
    }

    @Override
    public Sousage produceSousage() {
        return new PorkSousage();
    }
}
