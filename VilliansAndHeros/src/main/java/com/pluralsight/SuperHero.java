package com.pluralsight;

import java.util.Random;

public class SuperHero extends SuperPerson{

    public SuperHero(String name, int health, int powerLevel){
        super(name, health);

        this.experiencePoints = powerLevel;

        System.out.println(this.name + " has arrived with a power level of " + powerLevel);
    }

    @Override
    public void fight(SuperPerson opponent){
        int damageAmount = new Random().nextInt(21);
        int totalDamage = damageAmount + experiencePoints;
        if(damageAmount == 0){
            System.out.println(this.name + " has missed!");
        }else{
            System.out.println(this.name + " hits " + opponent.name + " with a web shot for " + totalDamage);
            opponent.takeDamage(totalDamage);

        }
    }
}
