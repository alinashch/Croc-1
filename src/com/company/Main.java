package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Point p1=Point.EnterCoordinates(1);
        Point p2=Point.EnterCoordinates(2);
        Point p3=Point.EnterCoordinates(3);
        System.out.println("Площадь треугольника: " + Point.square(p1,p2,p3));
    }


}
