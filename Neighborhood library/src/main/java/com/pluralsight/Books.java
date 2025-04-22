package com.pluralsight;

import java.util.Arrays;

public class Books {

    //variables that describe books
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //constructor
    public Books(){

        this.id = 0;
        this.isbn = "";
        this.title = "";
        this.isCheckedOut = isCheckedOut();
        this.checkedOutTo = "";

    }

    public void checkedOutTo(String name){

        System.out.println(this.getTitle() + " is checked out to " + this.getCheckedOutTo());

    }

    public void checkIn(){

        this.setCheckedOut(true);

    }

    public static String[] bookList(){
        String[] listOfBooks = new String[20];
        listOfBooks[0] = "asd";
        listOfBooks[1] = "asd";
        listOfBooks[2] = "asd";
        listOfBooks[3] = "asd";
        listOfBooks[4] = "asd";
        listOfBooks[5] = "asd";
        listOfBooks[6] = "asd";
        listOfBooks[7] = "asd";
        listOfBooks[8] = "asd";
        listOfBooks[9] = "asd";
        listOfBooks[10] = "asd";
        listOfBooks[11] = "sad";
        listOfBooks[12] = "asd";
        listOfBooks[13] = "asd";
        listOfBooks[14] = "asd";
        listOfBooks[15] = "asd";
        listOfBooks[16] = "asd";
        listOfBooks[17] = "sad";
        listOfBooks[18] = "asd";
        listOfBooks[19] = "asd";
        return listOfBooks;
    }



    //getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
