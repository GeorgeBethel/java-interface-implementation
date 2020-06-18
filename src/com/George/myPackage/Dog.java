package com.George.myPackage;

public class Dog implements Animals {
    private String order="Mammals";

    private String animalName="dog";

    private String communication="woff! woff!";

    public Dog(String animalName){

         getAnimalName(animalName);

    }


    public String getAnimalOrder(String order) {
        return this.order;
    }

    public void setAnimalName(String animalName) {

        if(animalName == "dog") {
            this.animalName = animalName;

        } else
            throw new IllegalArgumentException("please enter a valid animal name in the list [snake, Dog, Lion]");
    }

    public String getAnimalName(String animalName) {
        return animalName;
    }

    public String getCommunication(String communication) {
        return this.communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
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
