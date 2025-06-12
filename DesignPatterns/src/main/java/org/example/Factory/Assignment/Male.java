package org.example.Factory.Assignment;

public class Male implements Person {
    @Override
    public void wish(String msg) {
        System.out.println("Male wish " + msg);
    }
}
