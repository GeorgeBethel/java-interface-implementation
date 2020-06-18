package com.George.myPackage;

public class Snake implements Animals {

    private String animalName="snake";

    private String communication="fssss";

    private String order="reptile";

    public Snake(String animalName){

        getAnimalName(animalName);

    }

    public void setAnimalName(String animalName) {
        if(animalName == "snake"){
        this.animalName = animalName;
        } else
            throw new IllegalArgumentException("please enter a valid animal name in the list [snake, Dog, Lion]");

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
