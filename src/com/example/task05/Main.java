//Завдання 5
//Напишіть на ConverterTemperature клас для конвертації
// з градусів за Цельсієм в Кельвіни, Фаренгейти.
//У класу має бути метод convert, який робить конвертацію.

package com.example.task05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inData = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius");
        double celsius = inData.nextDouble();

        ConverterTemperature converterToFahrenheit = new CelsiusToFahrenheitConverter();
        ConverterTemperature converterToKelvin = new CelsiusToKelvinConverter();

        System.out.println(converterToKelvin.convert(celsius));

        System.out.println(converterToFahrenheit.convert(celsius));
    }
}
