package com.company;

import java.util.Scanner;

public class Square implements Area{
    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь квадрата = " + size*size);
    }
}