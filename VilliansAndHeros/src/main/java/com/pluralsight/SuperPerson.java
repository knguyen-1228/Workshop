package com.pluralsight;

import java.util.Random;

public class SuperPerson {

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

    public void fight(SuperPerson opponent){
        int damageAmount = new Random().nextInt(21);
        //print out who we are fighting
        System.out.println(this.name + " is fighting " + opponent.name);
        opponent.takeDamage(damageAmount + this.experiencePoints);
    }

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
