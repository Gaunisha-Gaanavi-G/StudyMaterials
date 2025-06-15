package org.example.Decorator;

public class CheeseDecorator extends PizzaDecorator{
    Pizza pizza;
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
        this.pizza = pizza;
    }

    public void bake(){
        super.bake();
        System.out.println("Adding Cheese...");
    }
}
