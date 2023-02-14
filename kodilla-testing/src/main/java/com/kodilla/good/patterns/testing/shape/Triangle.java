package com.kodilla.good.patterns.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private final static String name = "Tringle";
    private double edge1;
    private double edge2;
    private double edge3;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.edge1, edge1) == 0 && Double.compare(triangle.edge2, edge2) == 0 && Double.compare(triangle.edge3, edge3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge1, edge2, edge3);
    }
    public Triangle(double edge1,double edge2, double edge3){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return edge1 + edge2 + edge3;
    }
    //Zobaczyłem jak oglicza się pole trójkąta z długości boków i stwierdziłem że tutaj będzie obwód.
    //nawet nie bardzo wiem jak zrobić pierwiastek w obliczeniach
}
