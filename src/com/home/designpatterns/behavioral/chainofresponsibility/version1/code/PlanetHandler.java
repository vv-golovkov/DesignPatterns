package com.home.designpatterns.behavioral.chainofresponsibility.version1.code;

public abstract class PlanetHandler {
    private PlanetHandler successor;

    public void setSuccessor(PlanetHandler successor) {
        this.successor = successor;
    }
    
    public void handlePlanetRequest(PlanetEnum request) {
        String className = this.getClass().getSimpleName();
        
        if (request.equals(getPlanetType())) {
            System.out.println(String.format("--- %s handles %s ---", className, request));
            System.out.println();
        } else {
            System.out.println(String.format("%s doesn't support %s", className, request));
            if (successor != null) {
                successor.handlePlanetRequest(request);
            } else {
                System.err.println("Request can't be handled due to lack of appropriate handler in chain: " + request);
            }
        }
    }
    
    protected abstract PlanetEnum getPlanetType();
}
