package com.pluralsight;


import java.util.HashMap;
import java.util.Random;

public abstract class SuperPerson {

    private HashMap<String, Integer> battleLog = new HashMap<>();

    protected HashMap<String, Integer> powerUp = new HashMap<>();

    protected HashMap<String, Integer> villianPowerUp = new HashMap<>();

    //protected properties so they can possibly be ass
    protected  String name;
    protected  int health;
    protected int experiencePoints;

    public SuperPerson(String name,int health){
        this.name = name;
        this.health = health;

        this.experiencePoints = 0;
    }

    public boolean isAlive(){
        //if the health is greater than 0 return true else return false
        if(health > 0){
            return true;
        }else{
            return false;
        }

        // return this.health > 0;
    }
    public void addVillianPowerUp(){
        villianPowerUp.put("Specialized bomb", 5);
        villianPowerUp.put("Goblin glider",10);
        villianPowerUp.put("Nothing",0);
    }

    public void addPowerUp(){
        powerUp.put("Glove",5);
        powerUp.put("Mask",4);
        powerUp.put("Shoes",2);
        powerUp.put("Webs",10);
        powerUp.put("Nothing", 0);

    }

    public void logHit(SuperPerson opponent){
        String name = opponent.name;
        int count = battleLog.getOrDefault(name, 0);
        battleLog.put(name, count + 1);
    }

    public void printBattleLog(){
        System.out.println("Battle log for " + name + ":");
        for(HashMap.Entry<String, Integer> entry : battleLog.entrySet()){
            System.out.println(" - Hit " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }

    public abstract void fight(SuperPerson opponent);

    public abstract String getType();

    public void takeDamage(int damageAmount){
        //subtract damage from health but we don't want health below 0
        this.health -= damageAmount;
        if (this.health < 0){
            this.health = 0;
        }

    }

    public String getStatus(){
        //build and return string to check players health
        return this.name +" has " + this.health + " health left!";
    }

}
