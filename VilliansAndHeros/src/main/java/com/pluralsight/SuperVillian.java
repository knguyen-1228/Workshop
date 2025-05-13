package com.pluralsight;

import java.util.ArrayList;
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
        int bonus = 0;
        if(!villianPowerUp.isEmpty()){
            ArrayList<String> items = new ArrayList<>(villianPowerUp.keySet());
            String randomItem = items.get(new Random().nextInt(items.size()));
            bonus = villianPowerUp.get(randomItem);
            System.out.println(name + "activates power-up: " + randomItem + " (+" + bonus + " damage)");
        }
        int totalDamage = damageAmount + (this.experiencePoints * 2) + bonus ;
        if(damageAmount == 0){
            System.out.println(this.name + " has missed!");
        }else{
            System.out.println(this.name + " hits " + opponent.name + " with a glare for " + totalDamage);
            opponent.takeDamage(totalDamage);
            logHit(opponent);
        }

    }

    @Override
    public String getType() {
        return "SuperVillian";
    }

}
