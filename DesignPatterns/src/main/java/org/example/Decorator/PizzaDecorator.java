package org.example.Decorator;

public class PizzaDecorator extends PlainPizza{
    private Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    public void bake(){
        pizza.bake();
    }
}
