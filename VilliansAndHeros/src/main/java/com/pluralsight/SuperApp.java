package com.pluralsight;

public class SuperApp {

    public static void main(String[] args) {

        SuperHero hero1 = new SuperHero("Spiderman", 100, 25);
        SuperVillian villian1 = new SuperVillian("Green Goblin", 100,20);

        introduction();

        System.out.println("\n");
        System.out.println(hero1.getStatus());
        System.out.println(villian1.getStatus());

        System.out.println("\n");

        while(hero1.isAlive() && villian1.isAlive()){
            System.out.println("Spiderman is attacking");
            hero1.fight(villian1);
            System.out.println(villian1.getStatus());
            if(!villian1.isAlive()){
                break;
            }

            System.out.println("\n");

            System.out.println("Green Goblin is attacking");
            villian1.fight(hero1);
            System.out.println(hero1.getStatus());

            System.out.println("\n");

            if(!hero1.isAlive()){
                break;
            }
        }

        System.out.println("The battle has ended!");
        if (hero1.isAlive()){
            System.out.println("The winner of the Arena of Death is " + hero1.getStatus());
        }else{
            System.out.println("The winner of the Arena of Death is " + villian1.getStatus());
        }

        /*SuperPerson superAbraham = new SuperPerson("Abraham", 100);
        SuperHero superKevin = new SuperHero("Kevin", 100,25);
        SuperVillian villianNina = new SuperVillian("Nina", 100, 10);

        System.out.println("\n" + superAbraham.getStatus());
        System.out.println(superKevin.getStatus());
        System.out.println(villianNina.getStatus());

        superAbraham.takeDamage(15);
        superKevin.takeDamage(10);

        System.out.println("\n" + superAbraham.getStatus());
        System.out.println(superKevin.getStatus());

        System.out.println("\n");
        superAbraham.fight(superKevin);
        superKevin.fight(superAbraham);

        System.out.println("\n" + superAbraham.getStatus());
        System.out.println(superKevin.getStatus());*/

    }
    public static void introduction(){
        System.out.println("\nWelcome to the ARENA OF DEATH! May the better fighter win!");
        System.out.println("Will Spiderman be able to finally get revenge for Aunt may this time around? \nor will the Green Goblin continue to terrorize the town");
    }

}
