package com.pluralsight;

import java.util.Random;

public class SuperVillian extends SuperPerson{

    public SuperVillian(String name, int health, int evilPower) {
        super(name, health);

        this.experiencePoints = evilPower;

        System.out.println("The villian " + this.name + " has arrived with the evil power of " + evilPower);
    }

    @Override
    public void fight(SuperPerson opponent){
        int damageAmount = new Random().nextInt(6);
        int totalDamage = damageAmount + (this.experiencePoints * 2);
        if(damageAmount == 0){
            System.out.println(this.name + " has missed!");
        }else{
            System.out.println(this.name + " hits " + opponent.name + " with a glare for " + totalDamage);
            opponent.takeDamage(totalDamage);

        }
    }

}
