package com.George.myPackage;

public class PackClass implements Interface{
    int age;
    int principal;
    int rate;
    int time;

    public PackClass(int age, int principal, int rate, int time){

        this.age=age;
        this.principal=principal;
        this.rate=rate;
        this.time=time;
    }

    public int multiply(){

        return age*2;
    }

    @Override
    public int calculateInterest(int principal, int rate, int time) {
        return principal*rate*time/100;
    }
}
