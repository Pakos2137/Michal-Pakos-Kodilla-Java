package com.kodilla.good.patterns.testing.shape;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class ShapeCollectorTestSuite {
    @Test
    void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }
    @Test
    void testRemoveFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        boolean result = shapeCollector.removeFigure(shape);
        assertEquals(0,shapeCollector.getShapeCollection().size());
    }
    @Test
    void TestGetFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(2,3,5);
        shapeCollector.addFigure(shape);
        Shape shapeResult = shapeCollector.getFigure(0);
        assertEquals(shape,shapeResult);
    }
    @Test
    void TestShowFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(2);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape);
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();
        assertEquals(shapeList.toString(), shapeResultList.toString());
    }
}
