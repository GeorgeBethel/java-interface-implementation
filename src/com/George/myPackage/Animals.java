package com.George.myPackage;

public interface Animals {
    String animalName();
    String animalCommunication();
    String animalOrder();

    default String getAnimalName(String animalName){
        return "Unknown animal";
    }
}
