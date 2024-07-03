package org.example;
//Schritt 1: Erstellen Sie eine Klasse 'Book' mit den Eigenschaften 'title', 'author', und 'isbn'. #
// Implementieren Sie Getter- und Setter-Methoden für diese Eigenschaften.
//
//Schritt 2: Überschreiben Sie die Methode toString der Klasse "Book", um die Buchinformationen in einem lesbaren Format anzuzeigen.
//
//Schritt 3: Erstellen Sie eine Klasse 'Library' mit einem Array von 'Book'-Objekten.
//Schritt 4: Überschreiben Sie die toString-Methode der Klasse "Library", um die Informationen der "Library" in einem lesbaren Format anzuzeigen.
//
//Schritt 5: Erstellen Sie eine Instanz der 'Library'-Klasse mit einem Array von 'Book'-Objekten. Geben Sie die Bibliotheksinformationen auf der Konsole aus.

class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        System.out.println(myBook);

        Book[] myBooks = new Book[3];
        myBooks[0] = myBook;
        myBooks[1] = myBook;
        myBooks[2] = myBook;

        Library myLibrary = new Library(myBooks);
        System.out.println(myLibrary);
    }
}