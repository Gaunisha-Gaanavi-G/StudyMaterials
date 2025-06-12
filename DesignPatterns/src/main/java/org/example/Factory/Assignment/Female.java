package org.example.Factory.Assignment;

public class Female implements Person {
    @Override
    public void wish(String msg) {
        System.out.println("Female wish " + msg);
    }
}
