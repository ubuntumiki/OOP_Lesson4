//Завдання 3
//Використовуючи IntelliJ IDEA, створіть проект.
//Потрібно: Створіть 2 інтерфейси Playable та Recordable.
//У кожному з інтерфейсів створіть по 3 методи
//void play() / void pause() / void stop()та
// void record() / void pause() / void stop() відповідно.
//Створіть похідний клас Player від базових інтерфейсів Playable та Recordable.
//Написати програму, яка виконує програвання та запис.

package com.example.task03;

public class Main {
    public static void main(String[] args) {
        Playable player1 = new Player();

        player1.play();
        player1.pause();
        player1.stop();

        Recordable player2 = new Player();

        player2.record();
        player2.pause();
        player2.stop();
    }
}
