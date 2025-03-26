//Завдання 2
//Використовуючи IntelliJ IDEA, створіть проект.
//Потрібно: Створити клас AbstractHandler.
//У тілі класу створити методи void open(), void create(), void change(), void save().
//Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
//Написати програму, яка виконуватиме визначення документа і для кожного формату мають бути
//методи відкриття, створення, редагування, збереження певного формату документа.

package com.example.task02;

public class Main {
    public static void main(String[] args) {
        AbstractHandler doc = new XMLHandler();
        doc.open();
        doc.create();
        doc.change();
        doc.save();

        System.out.println("----------------------------");

        AbstractHandler doc1 = new TXTHandler();
        doc1.open();
        doc1.create();
        doc1.change();
        doc1.save();

        System.out.println("----------------------------");

        AbstractHandler doc2 = new DOCHandler();
        doc2.open();
        doc2.create();
        doc2.change();
        doc2.save();
    }
}
