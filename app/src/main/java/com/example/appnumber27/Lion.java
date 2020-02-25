package com.example.appnumber27;

public class Lion extends Animal {

    private boolean canFight = true;
    private int fightingPower;

    public Lion(String animalName , String animalColor , int power , int speed , boolean canFight , int fightingPower){
        super(animalName , animalColor , power , speed);

        if (fightingPower <= 0)
        {
            throw new IllegalArgumentException("The value of FightPower is must be greater than 0");
        }
        this.canFight = canFight;
        this.fightingPower = fightingPower;
    }

    public boolean getCanFight()
    {
        return canFight;
    }

    public void setCanFight(boolean canFight)
    {
        this.canFight = canFight;
    }

    public int getFightingPower()
    {
        return fightingPower;
    }

    public void setFightingPower(int fightingPower)
    {
        this.fightingPower = fightingPower;
    }

    @Override
    // Yeh wala method bhi super class (Animal) main mujood hai.
    public int calculateTheOverallPower() {
        return super.calculateTheOverallPower() + fightingPower;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %b%n%s: %d" ,
                super.toString() , "Can our lion fight" , getCanFight() ,
                "The fighting power of our lion is", getFightingPower());

    }
}
