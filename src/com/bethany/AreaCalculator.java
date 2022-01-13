package com.bethany;

public class AreaCalculator {
    public static void main(String[] args) {
        area(5.0);
        area(-1);
        area(5.0,4.0);
        area(-1.0, 4.0);
    }

    public static double area(double radius) {
        double circle = radius * radius * Math.PI;
        if (radius <0){
            System.out.println(-1.0);
            return -1.0;
        }
        System.out.println(circle);
        return circle;
    }

    public static double area(double x, double y) {

        double rectangle = x * y;
        if (x <0 || y <0) {
            System.out.println(-1.0);
            return -1.0;
        }
        System.out.println(rectangle);
        return rectangle;
    }
}
