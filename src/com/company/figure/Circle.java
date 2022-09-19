package com.company.figure;

import com.company.Figure;
// Circle это круг

public class Circle extends Figure {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (radius * 2 * Math.PI);
        //return (int) (2 * (Math.PI * radius));
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE1");

    }
}
