package com.home.designpatterns.behavioral.memento;

import com.home.designpatterns.behavioral.memento.code.DietInfoCaretaker;
import com.home.designpatterns.behavioral.memento.code.PersonDietInfo;

public class Launcher {
    
    public static void main(String[] args) {
        DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();
        
        PersonDietInfo personDietInfo = new PersonDietInfo("VASILIY", 1, 100);
        System.out.println(personDietInfo);
        dietInfoCaretaker.saveState(personDietInfo);
        
        personDietInfo.setDayNumberAndWeight(2, 95);
        System.out.println(personDietInfo);
        dietInfoCaretaker.saveState(personDietInfo);
        
        personDietInfo.setDayNumberAndWeight(3, 97);
        System.out.println(personDietInfo);
        dietInfoCaretaker.restoreLastState(personDietInfo);
        System.out.println(personDietInfo);
    }
}
