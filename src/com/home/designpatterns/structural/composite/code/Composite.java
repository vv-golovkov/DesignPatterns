package com.home.designpatterns.structural.composite.code;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private final List<Component> components = new ArrayList<Component>();
    
    public Composite(String name) {
        super(name);
    }
    
    public void add(Component component) {
        components.add(component);
    }
    
    public void remove(Component component) {
        components.remove(component);
    }
    
    @Override
    public void print() {
        for (Component component : components) {
            component.print();
        }
    }
}
