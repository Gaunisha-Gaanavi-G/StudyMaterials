package org.example.Decorator;

public class VeggieDecorator extends PizzaDecorator{
    Pizza pizza;
    public VeggieDecorator(Pizza pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    public void bake(){
        super.bake();
        System.out.println("Adding Veggies ...");
    }
}
