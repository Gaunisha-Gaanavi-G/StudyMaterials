package org.example.Flyweight;


public class Circle extends Shape {
    private String label;

    Circle(){
        this.label="Circle";
    }

    @Override
    public void draw(int radius, String lineColor,String fillColor) {
        System.out.println("Drawing "+label+" with color " +
                fillColor + " and radius " + radius + " and lineColor " + lineColor);
    }
}
