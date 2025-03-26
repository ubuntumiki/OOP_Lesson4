//OOP. 2
//Автор
//Жанр
//Назва
//Тираж
//вивести дані про книги, тираж яких не перевищує 10000 примірників.

package com.example.practice.task02;

public class Main {
    public static void main(String[] args) {
        Publication book1 = new Book("James", "Thriller", "Ashes of Tomorrow", 5000);
        Publication book2 = new Book("Emily", "Drama", "The Garden of Lies", 7000);
        Publication book3 = new Book("Derek", "Crime", "Dead Silence", 9000);
        Publication book4 = new Book("Samantha", "Romantic", "Beneath the Maple Sky", 15000);
        Publication book5 = new Book("Logan", "Fantasy", "The Last Heir of Avalon", 25000);

        Publication[] arrBook = {book1, book2, book3, book4, book5};

        for (Publication books : arrBook){
            books.displayInfo();
        }
    }
}
