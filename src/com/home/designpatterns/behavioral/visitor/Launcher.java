package com.home.designpatterns.behavioral.visitor;

import com.home.designpatterns.behavioral.visitor.code.city.CityElement;
import com.home.designpatterns.behavioral.visitor.code.city.CityVisitor;
import com.home.designpatterns.behavioral.visitor.code.city.Museum;
import com.home.designpatterns.behavioral.visitor.code.city.Park;

public class Launcher {

    public static void main(String[] args) {
        CityVisitor visitor = new CityVisitor();

        CityElement park = new Park();
        park.accept(visitor);

        CityElement museum = new Museum();
        museum.accept(visitor);
    }
}
