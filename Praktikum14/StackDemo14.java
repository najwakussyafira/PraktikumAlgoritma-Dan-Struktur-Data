package Praktikum14;

import java.util.Stack;

public class StackDemo14 {
    public static void main(String[] args) {
        Book14 book1 = new Book14("1234", "Dasar Pemogaman");
        Book14 book2 = new Book14("7145", "Hafalah Shalat Delisa");
        Book14 book3 = new Book14("3562", "Muhammad Al-Fatih");

        Stack<Book14> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book14 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book14 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book14 book : books) {
            System.out.println(book.toString());
        }

    int posisi = books.search(book1);
    if (posisi != -1) {
        System.out.println("Buku ditemukan pada posisi: " + posisi);
    } else {
        System.out.println("Buku tidak ditemukan.");
    }


        System.out.println(books);

    }
}
