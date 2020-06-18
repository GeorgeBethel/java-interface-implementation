package com.George.myPackage;

public class AnimalUser {

    Animals animal;

    public AnimalUser(Animals animal){

        this.animal=animal;
    }

    public void getAnimalProperties(){

        System.out.printf("%s communicates with a %s sound and is of the order %s ",animal.animalName(),animal.animalCommunication(),animal.animalOrder());
        System.out.println("\n");
    }
}
