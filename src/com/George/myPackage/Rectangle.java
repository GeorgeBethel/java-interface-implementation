package com.George.myPackage;

public class Rectangle implements Shape {
    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        setLength(length);
        setBreath(breath);
    }

    @Override
    public double calculateArea() {
        return length * breath;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    public double setLength(double length) {
        if(length < 0D) {
            return this.length;
        } else
            throw new IllegalArgumentException(" rectangle length must ne greater than 0");
    }

    public double setBreath(double breath) {
        if(breath < 0D) {
            return this.breath;
        } else
            throw new IllegalArgumentException(" rectangle breath must ne greater than 0");
    }
}
