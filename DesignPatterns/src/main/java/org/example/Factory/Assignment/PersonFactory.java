package org.example.Factory.Assignment;

public class PersonFactory {
    public static Person createPerson(String type) {
        if(type.equalsIgnoreCase("male")){
            return new Male();
        }
        else if(type.equalsIgnoreCase("female")){
            return new Female();
        }
        return null;
    }
}
