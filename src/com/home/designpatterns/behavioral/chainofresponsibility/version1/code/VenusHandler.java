package com.home.designpatterns.behavioral.chainofresponsibility.version1.code;

public class VenusHandler extends PlanetHandler {
    
    @Override
    protected PlanetEnum getPlanetType() {
        return PlanetEnum.VENUS;
    }
}
