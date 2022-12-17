package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }
    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }
    public boolean removeFigure(Shape shape){
        return shapeCollection.remove(shape);
    }
    public void showFigures(){
        System.out.println(shapeCollection.toString());
    }
    public Shape getFigure(int i){
        if(i<shapeCollection.size() && i>=0){
            return shapeCollection.get(i);
        } else {
            return null;
        }
    }
}
