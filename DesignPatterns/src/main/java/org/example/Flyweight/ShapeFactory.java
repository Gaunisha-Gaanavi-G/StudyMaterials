package org.example.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    public static Map<String,Shape> shapes = new HashMap<>();

    public static Shape createShape(String type){
        Shape shape = null;
        if(shapes.containsKey(type)){
            shape = shapes.get(type);
        }else{
            if(type.equals("circle")){
                shape = new Circle();
            }
            else if(type.equals("rectangle")){
                shape = new Rectangle();
            }
            shapes.put(type,shape);
        }
        return shape;
    }
}
