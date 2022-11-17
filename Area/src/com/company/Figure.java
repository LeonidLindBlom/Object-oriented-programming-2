package com.company;

import java.util.Scanner;

public class Figure {

    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);
        System.out.println("Введите название фигуры");
        String figure = menuScanner.nextLine();
        switch (figure){
            case "круг":
                Scanner circleScanner = new Scanner(System.in);
                System.out.println("Введите радиус круга ");
                double radius = circleScanner.nextDouble();
                Circle circle = new Circle(radius);
                circle.calculateArea();
                break;
            case "квадрат":
                Scanner squareScanner = new Scanner(System.in);
                System.out.println("Введите длину стороны квадрата ");
                double size = squareScanner.nextDouble();
                Square square = new Square(size);
                square.calculateArea();
                break;
            case "треугольник":
                Scanner triangleScanner = new Scanner(System.in);
                System.out.println("Введите первую сторону прямоугольного треугольника ");
                double firstSide = triangleScanner.nextDouble();
                System.out.println("Введите вторую сторону треугольника ");
                double secondSide = triangleScanner.nextDouble();
                RightTriangle triangle = new RightTriangle(firstSide,secondSide);
                triangle.calculateArea();
                break;
            default:
                System.out.println("Введите фигуру!!!");
        }
    }
}