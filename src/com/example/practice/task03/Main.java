//OOP. 3
//Прізвище
//Вік
//Освіта
//Посада
//Вивести дані про працівників старших 30-ти років,
//які не мають вищої освіти.

package com.example.practice.task03;

public class Main {
    public static void main(String[] args) {
        Person worker1 = new Worker("Tovt", 25, "Trade School", "worker");
        Person worker2 = new Worker("Agij", 31, "High School", "worker");
        Person worker3 = new Worker("Gak", 35, "Higher Education", "worker");
        Person worker4 = new Worker("Rom", 45, "High School", "worker");
        Person worker5 = new Worker("Lev", 42, "Trade School", "worker");

        Person[] arrWorker = {worker1, worker2, worker3, worker4, worker5};

        for (Person workers : arrWorker){
            workers.ageMore30();
        }
    }
}
