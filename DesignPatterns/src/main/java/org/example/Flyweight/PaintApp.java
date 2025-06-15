package org.example.Flyweight;

public class PaintApp {
    public void paint(int numberOfShapes){
        Shape[] shapes = new Shape[numberOfShapes+1];

        for(int i=0;i<numberOfShapes;i++){
            if(i%2==0){
                shapes[i] = ShapeFactory.createShape("circle");
                shapes[i].draw(i,"red","white");
            }
            else{
                shapes[i] = ShapeFactory.createShape("rectangle");
                shapes[i].draw(i,i+i,"black");
            }
        }
    }
}
