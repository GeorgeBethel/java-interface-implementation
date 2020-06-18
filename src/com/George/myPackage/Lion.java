package com.George.myPackage;

public class Lion implements Animals {

    private String animalName="lion";
    private String communication="Roarr!";
    private String order="Mammals";

    public Lion(String animalName){

        getAnimalName(animalName);
    }

    public void setAnimalName(String animalName) {
        if(animalName == "lion") {
            this.animalName = animalName;
        } else
            throw new IllegalArgumentException("please enter a valid animal name in the list [snake, Dog, Lion]");
    }


    public String getAnimalName() {
        return animalName;
    }

    public String getCommunication() {
        return communication;
    }

    public String getOrder() {
        return order;
    }

    @Override
    public String animalName() {
        return animalName;
    }

    @Override
    public String animalCommunication() {
        return communication;
    }

    @Override
    public String animalOrder() {
        return order;
    }
}
