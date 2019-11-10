package com.itea.java.homeworks.l2.pehov_alex;

public class Figures {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата = " + square_s(8, 6));
        System.out.println("Периметр квадрата = " + square_p(6, 6, 6, 6));
        System.out.println("Площадь треугольника = " + trisngle_s(9, 6));
        System.out.println("Периметр треугольника = " + triangle_p(6, 9, 6));
        System.out.println("Площадь куба = " + cube_s(10));
        System.out.println("Периметр куба = " + cube_p(4));
    }
    //Площадь квадрата
    public static double square_s(double a, double b) {
        double s = a * b;
        return s;
    }
    //Периметр квадрата
    public static double square_p(double a, double b, double c, double d) {
        double p = a + b + c + d;
        return p;
    }
    //Площадь треугольника
    public static double trisngle_s(double a, double h) {
        double s = (a * 0.5) * h;
        return s;
    }
    //Периметр треугольника
    public static double triangle_p(double a, double b, double c) {
        double p = a + b + c;
        return p;
    }
    //Площадь куба
    public static double cube_s(double a) {
        double s = 6 * (a * a);
        return s;
    }
    //Периметр куба
    public static double cube_p(double a) {
        double p = 12 * a;
        return p;
    }

}