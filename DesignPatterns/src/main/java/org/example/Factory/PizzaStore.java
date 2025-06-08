package org.example.Factory;

public class PizzaStore {
    public static void createPizza(String type) {
        Pizza p = PizzaFactory.createPizza(type);
        //Do something with pizza object
        p.prepare();
        p.bake();
        p.cut();
    }
}
