package com.pluralsight;

//importing scanner
import java.util.Scanner;


public class NeighborhoodLibraryApp {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        welcome();
        homeScreen();
        while (true){
            String choice =askName("What would you like to do? \t");

            if(choice.equalsIgnoreCase("1")){
                availableBooks();

            } else if(choice.equalsIgnoreCase("2")){
                checkedOutBooks();

            }else if(choice.equalsIgnoreCase("3")){
                System.out.println("Good Bye! See you next time");

            }else{
                System.out.println("\nInvalid response: Returning to Home Screen\n");
                homeScreen();
            }
        }



    }

    public static void welcome(){
        System.out.println("Welcome to the Neighborhood Library!");
        System.out.println("---------------------------------------------------------");
        System.out.print("\n");
        System.out.println("Please Fill The Information Below");
        System.out.println("---------------------------------------------------------");

        String infoAnswer = askName("Please Enter Your Name: \t");

        System.out.println("Welcome " + infoAnswer + "!");
        System.out.print("\n");
    }


    public static String askName(String name){
        System.out.print(name);
        String nameAnswer = myScanner.nextLine();

        return nameAnswer.trim();
    }
    public static void homeScreen(){
        System.out.println("Home Screen");
        System.out.println("----------------------------------------------");
        System.out.println("[1] Show Available Books \n[2] Show Checked Out Books \n[3] Closes Out of the App ");

    }
    public static void availableBooks(){
        //display id, isbn, and title
        System.out.println("Available Books");
        System.out.println("----------------------------------------------");
        System.out.println("Please select which book you'd like to check out \n[X] Return to the home screen");

    }
    public static void checkedOutBooks(){
        //display id,isbn, title, and name of person who has the book
        System.out.println("Checked Out Books");
        System.out.println("----------------------------------------------");
        System.out.println("[C] Check In a book \n[X] Return to the home screen");

    }
    public static void checkInBook(){
        System.out.println("Check In");
        System.out.println("----------------------------------------------");
        System.out.println("Enter the ID of the book you want to Check In \n[X] Return to the home screen");

    }
}
