package com.pluralsight;

public class SuperApp {

    public static void main(String[] args) {


        SuperPerson superAbraham = new SuperPerson("Abraham", 100);
        SuperHero superKevin = new SuperHero("Kevin", 100,25);

        System.out.println("\n" + superAbraham.getStatus());
        System.out.println(superKevin.getStatus());

        superAbraham.takeDamage(15);
        superKevin.takeDamage(10);

        System.out.println("\n" + superAbraham.getStatus());
        System.out.println(superKevin.getStatus());

        System.out.println("\n");
        superAbraham.fight(superKevin);
        superKevin.fight(superAbraham);

        System.out.println("\n" + superAbraham.getStatus());
        System.out.println(superKevin.getStatus());

    }
}
