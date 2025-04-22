package com.pluralsight;

public class Book {
    // init variables for Book class
    int id;
    String isbn, title, checkedOutTo;
    boolean isCheckedOut;

    // Class definition
    public Book() {
        this.id = 1;
        this.isbn = "";
        this.title = "";
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }
}
