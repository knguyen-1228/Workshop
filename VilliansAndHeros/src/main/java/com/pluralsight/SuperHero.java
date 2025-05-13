package com.pluralsight;

import java.util.ArrayList;
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
        int bonus = 0;

        if(!powerUp.isEmpty()){
            ArrayList<String> items = new ArrayList<>(powerUp.keySet());
            String randomItem = items.get(new Random().nextInt(items.size()));
            bonus = powerUp.get(randomItem);
            System.out.println(name + "activates power-up: " + randomItem + " (+" + bonus + " damage)");

        }
        int totalDamage = damageAmount + experiencePoints + bonus;
        if(damageAmount == 0){
            System.out.println(this.name + " has missed!");
        }else{
            System.out.println(this.name + " hits " + opponent.name + " with a web shot for " + totalDamage);
            opponent.takeDamage(totalDamage);
            logHit(opponent);

        }

    }

    @Override
    public String getType() {
        return "SuperHero";
    }
}
