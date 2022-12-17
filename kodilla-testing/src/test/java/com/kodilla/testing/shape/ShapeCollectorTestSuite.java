package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
public class ShapeCollectorTestSuite {
    @Test
    void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4); //<--- długość boku
        shapeCollector.addFigure(shape);
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }
}
