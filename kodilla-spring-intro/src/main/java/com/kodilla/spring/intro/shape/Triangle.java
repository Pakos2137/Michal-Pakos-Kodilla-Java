package com.kodilla.spring.intro.shape;

import com.kodilla.spring.intro.shape.Figure;

public class Triangle implements Shape {

    @Override
    public String draw() {
        System.out.println("This is a triangle");
        return "This is a triangle";
    }
}
