package com.itea.java.homeworks.l2.smsm;

public class Oval {
    public static double perimeter(double l1, double l2) {
        return 4*(Math.PI*l1*l2 + (l1-l2)*(l1-l2))/(l1+l2);
    }
    public static double area(double l1, double l2) {
        return l1*l2*Math.PI;
    }
}