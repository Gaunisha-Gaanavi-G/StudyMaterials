package org.example.Factory;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Veggie Pizza");
    }
}
