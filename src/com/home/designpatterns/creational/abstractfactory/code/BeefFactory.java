package com.home.designpatterns.creational.abstractfactory.code;

import com.home.designpatterns.creational.abstractfactory.code.product1.Beef;
import com.home.designpatterns.creational.abstractfactory.code.product1.Meat;
import com.home.designpatterns.creational.abstractfactory.code.product2.BeefSousage;
import com.home.designpatterns.creational.abstractfactory.code.product2.Sousage;

public class BeefFactory extends AbstractMeatFactory {

    @Override
    public Meat produceMeat() {
        return new Beef();
    }

    @Override
    public Sousage produceSousage() {
        return new BeefSousage();
    }
}
