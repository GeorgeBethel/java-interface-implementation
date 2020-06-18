package com.George.myPackage;

public interface Shape {

    double calculateArea();

    default String getName(){
     return "Unknown";
    }
}
