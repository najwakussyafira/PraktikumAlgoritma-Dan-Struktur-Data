package Praktikum14;

public class Book14 {
    public String isbn;
    public String title;

    public Book14() {

    }

    public Book14(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + this.isbn + "Title: " + this.title;
    }
}