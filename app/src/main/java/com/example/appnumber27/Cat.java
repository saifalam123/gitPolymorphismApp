package com.example.appnumber27;

public class Cat extends Animal {

    public Cat(String animalName , String animalColor , int speed , int power){
        super(animalName , animalColor , speed , power);
    }

    @Override
    public int calculateTheOverallPower() {
        return super.calculateTheOverallPower();
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString();
    }
}
