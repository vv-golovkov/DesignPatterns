package com.home.designpatterns.behavioral.memento.code;

//originator - object whose state we want to save
public class PersonDietInfo {
    private final String personName;
    private int dayNumber;
    private double weight;
    
    private Memento lastState;

    public PersonDietInfo(String personName, int dayNumber, double weight) {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("[Name=%s; Day=%d; Weight=%s kg]", personName, dayNumber, weight);
    }

    public void setDayNumberAndWeight(int dayNumber, int weight) {
        this.dayNumber = dayNumber;
        this.weight = weight;
    }
    
    public Memento save() {
        System.out.println("Saving the state...Ok");
        System.out.println();
        return lastState = new Memento(dayNumber, weight);
    }
    
    public void restore(Object object) {
        if (object instanceof Memento) {
            Memento memento = (Memento) object;
            dayNumber = memento.mementoDayNumber;
            weight = memento.mementoWeight;
        }
    }
    
    public void restore() {
        System.out.println("Restoring last state...Ok");
        dayNumber = lastState.mementoDayNumber;
        weight = lastState.mementoWeight;
    }
    
    //memento - object that stores the saved state of the originator
    private class Memento {
        private final int mementoDayNumber;
        private final double mementoWeight;
        
        Memento(int dayNumber, double weight) {
            mementoDayNumber = dayNumber;
            mementoWeight = weight;
        }
    }
}
