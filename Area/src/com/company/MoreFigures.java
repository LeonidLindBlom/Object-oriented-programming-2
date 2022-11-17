package com.company;

import java.util.Scanner;

public class MoreFigures {
    public static void main(String[] args) {
        Scanner sizeScanner = new Scanner(System.in);
        Scanner figureScanner = new Scanner(System.in);
        System.out.println("Введлите количество элементов массива ");
        int N = sizeScanner.nextInt();
        Area[] figure = new Area[N];

        for (int i = 0; i < N; i++) {
            String figureName = figureScanner.nextLine();
            switch (figureName){
                case "круг":
                    Scanner circleScanner = new Scanner(System.in);
                    System.out.println("Введите радиус круга ");
                    double radius = circleScanner.nextDouble();
                    Circle circle = new Circle(radius);
                    figure[i] = circle;
                    break;
                case "квадрат":
                    Scanner squareScanner = new Scanner(System.in);
                    System.out.println("Введите длину стороны квадрата ");
                    double size = squareScanner.nextDouble();
                    Square square = new Square(size);
                    figure[i] = square;
                    break;
                case "треугольник":
                    Scanner triangleScanner = new Scanner(System.in);
                    System.out.println("Введите первую сторону прямоугольного треугольника ");
                    double firstSide = triangleScanner.nextDouble();
                    System.out.println("Введите вторую сторону треугольника ");
                    double secondSide = triangleScanner.nextDouble();
                    RightTriangle triangle = new RightTriangle(firstSide, secondSide);
                    figure[i] = triangle;
                    break;
                default:
                    System.out.println("Введите фигуру!!!");
            }
        }

        for (int i = 0; i < N; i++) {
            figure[i].calculateArea();
        }
    }
}