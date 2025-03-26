package com.example.task05;

public class CelsiusToFahrenheitConverter extends ConverterTemperature{
    static final double fahrenheit1 = 1.8;
    static final double fahrenheit2 = 32;

    @Override
    public double convert(double celsius) {
        return celsius * fahrenheit1 + fahrenheit2;
    }
}
