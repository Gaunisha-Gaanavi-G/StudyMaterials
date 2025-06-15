package org.example.Flyweight;


public class Rectangle extends Shape {
    private String label;

    Rectangle() {
        this.label = "Rectangle";
    }
    @Override
    public void draw(int length,int width,String fillStyle) {
        System.out.println("Drawing "+label+" with length "+length+" and width "+width +" fillStyle "+fillStyle);
    }
}
