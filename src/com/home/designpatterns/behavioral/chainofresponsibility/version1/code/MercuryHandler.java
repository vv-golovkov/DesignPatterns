package com.home.designpatterns.behavioral.chainofresponsibility.version1.code;

public class MercuryHandler extends PlanetHandler {
    
    @Override
    protected PlanetEnum getPlanetType() {
        return PlanetEnum.MERCURY;
    }
}
