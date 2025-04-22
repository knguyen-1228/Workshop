package com.pluralsight;


public class Books {

    //variables that describe books
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //constructor
    public Books(int id, String isbn, String title){

        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.setCheckedOut(false);
        this.setCheckedOutTo("");

    }

    public void checkedOutTo(String name){
        this.setCheckedOut(true);
        this.setCheckedOutTo(name);


    }

    public void checkIn(){

        this.setCheckedOut(false);
        this.setCheckedOutTo("");

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
