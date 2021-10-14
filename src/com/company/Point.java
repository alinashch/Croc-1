package com.company;

import java.util.Scanner;

public class Point {
    double x;
    double y;
    public Point( double x, double y){
        this.x=x;
        this.y=y;
    }
    public static Point EnterCoordinates(int i){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите координату вершины х "+i);
        double x=scanner.nextDouble();
        System.out.println("Введите координату вершины у "+i);
        double y=scanner.nextDouble();
        Point p=new Point(x,y);
        return p;
    }
    public static double square(Point p1, Point p2, Point p3){
        double a= Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
        double b= Math.sqrt((p3.x-p2.x)*(p3.x-p2.x)+(p3.y-p2.y)*(p3.y-p2.y));
        double c= Math.sqrt((p1.x-p3.x)*(p1.x-p3.x)+(p1.y-p3.y)*(p1.y-p3.y));
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

}
