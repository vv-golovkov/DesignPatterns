package com.home.designpatterns.behavioral.chainofresponsibility.version1;

import com.home.designpatterns.behavioral.chainofresponsibility.version1.code.EarthHandler;
import com.home.designpatterns.behavioral.chainofresponsibility.version1.code.MercuryHandler;
import com.home.designpatterns.behavioral.chainofresponsibility.version1.code.PlanetEnum;
import com.home.designpatterns.behavioral.chainofresponsibility.version1.code.PlanetHandler;
import com.home.designpatterns.behavioral.chainofresponsibility.version1.code.VenusHandler;

public class Launcher {
    
    public static void main(String[] args) {
        PlanetHandler planetHandler = setUpChainSequence();
        
        planetHandler.handlePlanetRequest(PlanetEnum.EARTH);
        planetHandler.handlePlanetRequest(PlanetEnum.SATURN);
        planetHandler.handlePlanetRequest(PlanetEnum.MERCURY);
        planetHandler.handlePlanetRequest(PlanetEnum.VENUS);
    }
    
    private static PlanetHandler setUpChainSequence() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();
        
        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);
        return mercuryHandler;
    }
}
