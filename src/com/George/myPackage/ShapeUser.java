package com.George.myPackage;

public class ShapeUser {

    private Shape shape;

    public ShapeUser(Shape shape) {
        setShape(shape);
    }

    private void setShape(Shape shape) {
        this.shape = shape;
    }

    public void printShapeArea() {
        System.out.printf("The area of the %s is %.2f", shape.getName(), shape.calculateArea());
    }


}
