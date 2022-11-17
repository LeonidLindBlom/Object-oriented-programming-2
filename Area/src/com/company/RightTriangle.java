package com.company;

import java.util.Scanner;

public class RightTriangle implements Area{
    private double firstSide;
    private double secondSide;

    public RightTriangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь прямоугольного треугольника = " + (firstSide * secondSide) / 2);
    }
}
