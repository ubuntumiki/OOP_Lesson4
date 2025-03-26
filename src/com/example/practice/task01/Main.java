//OOP. 1
//Автор
//Кількість сторінок
//Тираж
//Рік видання
//Вивести дані про книги, у яких кількість сторінок більша за 150

package com.example.practice.task01;

public class Main {
    public static void main(String[] args) {
        Publication book1 = new Book("Liza", 111, 1000, 2024);
        Publication book2 = new Book("Rox", 567, 3000, 2024);
        Publication book3 = new Book("RIP", 125, 10000, 2023);
        Publication book4 = new Book("Roma", 157, 700, 2022);
        Publication book5 = new Book("Leonard", 177, 1500, 2021);

        Publication[] arrBook = {book1, book2, book3, book4, book5};

        for (Publication book : arrBook){
            book.displayInfo();
        }
    }
}
