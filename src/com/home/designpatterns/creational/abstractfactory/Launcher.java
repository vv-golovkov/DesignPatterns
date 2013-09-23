package com.home.designpatterns.creational.abstractfactory;

import com.home.designpatterns.creational.abstractfactory.code.AbstractMeatFactory;
import com.home.designpatterns.creational.abstractfactory.code.BeefFactory;
import com.home.designpatterns.creational.abstractfactory.code.PorkFactory;
import com.home.designpatterns.creational.abstractfactory.code.product1.Meat;
import com.home.designpatterns.creational.abstractfactory.code.product2.Sousage;


public class Launcher {
    
    public static void main(String[] args) {
        new Launcher().produceFactoryProducts(new BeefFactory());
        System.out.println("----------------------------------");
        new Launcher().produceFactoryProducts(new PorkFactory());
    }
    
    private void produceFactoryProducts(AbstractMeatFactory meatFactory) {
        Meat meat = meatFactory.produceMeat();
        Sousage sousage = meatFactory.produceSousage();
        System.out.println(meat.describe());
        System.out.println(sousage.describe());
    }
}
