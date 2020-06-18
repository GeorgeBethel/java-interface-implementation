package com.George;
import com.George.myPackage.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x=4;

        PackClass packClass= new PackClass(20, 100, 50, 5);

        Animals animal=new Snake("snake");
        AnimalUser animalUser=new AnimalUser(animal);
        animalUser.getAnimalProperties();

//        Shape shape = new Triangle(2.0, 1.5);
//        ShapeUser shapeUser = new ShapeUser(shape);
//        shapeUser.printShapeArea();

        int interest=packClass.calculateInterest(20, 100, 50);
        System.out.println("the interest is: "+ interest+"\n area of rectangle");
        //int y=5;
        /*String names [] = {"george","amaka","nkechi"}; // array to hold the names

        int age []= {10,20,15}; // array to hold ages

        // for loop to loop over the names and age
        for(int i=0; i<3; i++){

            System.out.println(names[i]+"'s age is "+age[i]);
        }

        // another control loop
        System.out.println(x+" multiplied by "+y+" is: "+x*y);
        if(x*y>10){

            System.out.println("number is greater than 10");

        }
        else{

            System.out.println("number is less than 10");
        }
        */
        //nexted for loop
        /*
        for(y=5; y>0; y--){
            for(x=4; x>0; x--){

                System.out.println("y is: "+y+"\n x is :"+x);
            }
        }
        System.out.println("hello world");

         */
        //switch statement
        /*switch(x){

            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
        }

         */
        //while loop
        /*int n=0;
        while(n<5){

            System.out.println("n is equal to: "+n);
            n++;
        }

         */
        //do while loop. it is used when you want the loop to go at least once before checking for condition
        /*int m=5;
        do{
            System.out.println("m is: "+m);
            m++;
        } while(m<5);

         */
         //testing out inline if statement

         /*x=5;
         boolean isfour=true;
         if(x==4) isfour=true;
         else isfour=false;

         System.out.println("isfour is: "+isfour);

          */

        newclass val=new newclass(5,6);
        newclass val2=new newclass(10,4);
        newclass nw=new newclass();
        overloaded ol=new overloaded();
        newclass r1=new newclass(20,20);
        System.out.println("this is the cal method: "+r1.cal(r1));
        ol.test();
        ol.test(2);
        ol.test(2.8,12.4);

        System.out.println("this is the private variable: "+ val.getName());

        System.out.println(val.volume());
        System.out.println(val2.volume());

    }

}
