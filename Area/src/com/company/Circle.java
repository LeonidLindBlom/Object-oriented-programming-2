package com.company;

import java.util.Scanner;

public class Circle implements Area{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь круга = " + Math.PI * radius * radius);
    }
}