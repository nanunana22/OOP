package org.example;

import java.util.Arrays;

public class Library {
    Book[] book_objekts;

    public Library(Book[] book_objekts) {
        this.book_objekts = book_objekts;
    }
    public String toString(){
        return Arrays.toString(book_objekts);
    }
}

