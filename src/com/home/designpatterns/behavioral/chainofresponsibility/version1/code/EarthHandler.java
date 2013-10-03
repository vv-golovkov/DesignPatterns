package com.home.designpatterns.behavioral.chainofresponsibility.version1.code;

public class EarthHandler extends PlanetHandler {
    
    @Override
    protected PlanetEnum getPlanetType() {
        return PlanetEnum.EARTH;
    }
}
