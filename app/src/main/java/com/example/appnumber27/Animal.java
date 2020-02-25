package com.example.appnumber27;

public class Animal {

    private String animalName;
    private String animalColor;
    private int animalSpeed;
    private int animalPower;

    // Jab hum koi variable private banate hain tou uska setter ban sakta hai jab kay final ka setter nahi banta.

    // Making constructor or agar hum yeh nahi karte tou hum bydefault constructor ko call karte. Constructor humesha class kay naam ka hee hota hai.
    public Animal(String animalName , String animalColor , int animalSpeed , int animalPower){

        if (animalPower <= 0 )
        {
            throw new IllegalArgumentException("The value of Power must be greater than 0");
        }
        if (animalSpeed <= 0)
        {
            throw new IllegalArgumentException("The value of Speed must be Greater than 0");
        }

        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalSpeed = animalSpeed;
        this.animalPower = animalPower;
    }

    public String getAnimalName()
    {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColor()
    {
        return animalColor;
    }

    public void setAnimalColor(String animalColor)
    {
        this.animalColor = animalColor;
    }

    public int getAnimalSpeed()
    {
        return animalSpeed;
    }

    public void setAnimalSpeed(int animalSpeed)
    {
        this.animalSpeed = animalSpeed;
    }

    public int getAnimalPower()
    {
        return animalPower;
    }

    public void setAnimalPower(int animalPower)
    {
        this.animalPower = animalPower;
    }

    public  int calculateTheOverallPower()

    {
        return getAnimalPower() * getAnimalSpeed();
    }


    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %d%n%d: %d" ,
                "Animal Name" , getAnimalName() , "Animal Color" , getAnimalColor() ,
                "Animal Power" , getAnimalPower() , "Animal Speed" , getAnimalSpeed());
    }
}
