package org.example;

public class Book {
    String title;
    String author;
    String isbn;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }

    public String toString() {
         return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
    }
}
