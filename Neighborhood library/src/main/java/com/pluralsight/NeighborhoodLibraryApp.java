package com.pluralsight;

//importing scanner
import java.util.Scanner;


public class NeighborhoodLibraryApp {

    static Books[] theBooks = {
            new Books(1, "1234", "Ready Player 1"),
            new Books(2, "2345", "Alice in Wonderland"),
            new Books(3, "3456", "A Court of Throne and Roses"),
            new Books(4, "4567", "A Court of Mist and Fury"),
            new Books(5, "5678", "A Court of Wings and Ruin"),
            new Books(6, "6790", "A Court of Frost and Starlight"),
            new Books(7, "12345", "A Court of Silver Flames"),
            new Books(8, "23456", "The Midnight Library"),
            new Books(9, "34567", "Where the Crawdads Sing"),
            new Books(10, "45678", "1984"),
            new Books(11, "56789", "Verity"),
            new Books(12, "67890", "The Alchemist"),
            new Books(13, "1123", "To Kill a Mockingbird"),
            new Books(14, "2234", "The Book Thief"),
            new Books(15, "3345", "The Lightning Thief"),
            new Books(16, "4456", "The Sea of Monsters"),
            new Books(17, "5567", "The Titan's Curse"),
            new Books(18, "6678", "The Battle of the Labyrinth"),
            new Books(19, "7789", "The Last Olympian"),
            new Books(20, "8890", "Atomic Habits"),


    };

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean appRunning = true;
        while(appRunning) {
            int hChoice = mainMenu();
            switch (hChoice) {
                case 1:
                    int userBookChoice = viewAvailableBooks();
                    myScanner.nextLine();
                    if (userBookChoice != -1) {
                        System.out.println("what is your name?");
                        String userName = myScanner.nextLine();
                        theBooks[userBookChoice].checkedOutTo(userName);
                    }
                    break;
                case 2:
                    System.out.println("Below are the books that are checked out");
                    int bookUnavailiable = viewCheckedBooks();
                    if(bookUnavailiable == -1){
                        continue;
                    }
                    if(bookUnavailiable < theBooks.length){
                        myScanner.nextLine();

                        theBooks[bookUnavailiable].checkIn();

                        System.out.println("\n" + theBooks[bookUnavailiable].getTitle() + "has been returned to the library!\n");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the App");
                    appRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }



    }
    static int mainMenu(){
        System.out.println("Welcome to the Neighborhood Library!");
        System.out.println("---------------------------------------------------------");

        System.out.println("\nHome Screen");
        System.out.println("----------------------------------------------");
        System.out.println("[1] Show Available Books \n[2] Show Checked Out Books \n[3] Closes Out of the App ");
        System.out.println("What would you like to do?");
        return myScanner.nextInt();
    }

    static int viewAvailableBooks(){

        System.out.println("These are the availalbe books! \n");
        for (int i = 0; i<theBooks.length;i++) {
            Books currentBook = theBooks[i];

            if (currentBook.isCheckedOut() == false) {
                System.out.println("id: " + i + " isbn: " + currentBook.getIsbn() + " - " + currentBook.getTitle());
            }
        }
        myScanner.nextLine();
        System.out.println("\nWould you like to check out a book? (y/n)");
        String userSelection = myScanner.nextLine();
        if (userSelection.equalsIgnoreCase("y") || userSelection.equalsIgnoreCase("yes")){
            System.out.println("Please enter the id of the book you want to check out");
            return myScanner.nextInt();
            }

        return mainMenu();
    }

    static int viewCheckedBooks(){
        for (int i = 0; i<theBooks.length;i++) {
            Books currentBook = theBooks[i];

            if (currentBook.isCheckedOut()) {
                System.out.println("id: " + i + " isbn: " + currentBook.getIsbn() + " - " + currentBook.getTitle() + " checked out to " + currentBook.getCheckedOutTo());
            }
        }
        myScanner.nextLine();
        System.out.println("Would you like to: \n [C] Check in a book \n [X] Go back to home");
        String userInput = myScanner.nextLine();
        if(userInput.equalsIgnoreCase("c")){
            System.out.println("Please enter the id of the book you'd like to check in");
            return myScanner.nextInt();
        }else{
            System.out.println("Returning to home");
            return mainMenu();
        }

    }


}
