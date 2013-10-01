package com.home.designpatterns.behavioral.visitor.code;

import com.home.designpatterns.behavioral.visitor.code.city.Museum;
import com.home.designpatterns.behavioral.visitor.code.city.Park;

public interface Visitor {
    public void visit(Park park);
    public void visit(Museum museum);
}
