package com.George.myPackage;

public class Triangle implements Shape {
    private double height;
    private double base;

    private static final String SHAPE_NAME = "Triangle";

    public Triangle(double height, double base) {
        setHeight(height);
        setBase(base);
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    public void setHeight(double height) {
        if (height > 0D) {
            this.height = height;
        }else
            throw new IllegalArgumentException("Triangle height must be greater than zero");
    }

    public void setBase(double base) {
        this.base = base;
    }
}
