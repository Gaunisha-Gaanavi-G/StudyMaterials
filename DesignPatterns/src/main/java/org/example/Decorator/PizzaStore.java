package org.example.Decorator;


public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new VeggieDecorator(new CheeseDecorator(new PlainPizza()));
        pizza.bake();
    }
}
