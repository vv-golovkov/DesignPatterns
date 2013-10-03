package com.home.designpatterns.behavioral.memento.code;

//caretaker - saves and restores a DietInfo object's state via a memento
//note that DietInfo.Memento isn't visible to the caretaker so we need to cast the memento to Object
public class DietInfoCaretaker {
    private Object object;
    
    public void saveState(PersonDietInfo personDietInfo) {
        personDietInfo.save();
    }
    
    public void restoreState(PersonDietInfo personDietInfo) {
        personDietInfo.restore(object);
    }
    
    public void restoreLastState(PersonDietInfo personDietInfo) {
        personDietInfo.restore();
    }
}
