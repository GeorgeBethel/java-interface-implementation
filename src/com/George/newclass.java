package com.George;

import com.George.myPackage.Interface;

public class newclass implements Interface {

        int num1;
        private String name="john";
        int num2;
        int n;

        newclass(int x,int y){
         System.out.println("i was called");
         this.num1=x;
         this.num2=y;
        }

        newclass(){
            System.out.println("i was just called for nothing");
            num1=-1;
            num2=-1;
        }



        public int volume(){

            return num1*num2;
        }

    public String getName() {
        return name;
    }

    int cal(newclass r1){
            System.out.println("i used method  as object");
            return r1.num1*r1.num2;
        }

    @Override
    public int calculateInterest(int principal, int rate, int time) {
        return principal * (1 + rate/100 ) ^ n;
    }
}

class overloaded{

void test(){

    System.out.println("no parameter");
}
void test(int a){
    System.out.println("a "+a);
}
double test(double b,double c){
    return b*c;
}

}

