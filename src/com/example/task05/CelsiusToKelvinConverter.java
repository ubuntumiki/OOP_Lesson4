package com.example.task05;

public class CelsiusToKelvinConverter extends ConverterTemperature{
    static final double kelvin = 273.15;

    @Override
    public double convert(double celsius) {
        return celsius + kelvin;
    }
}
