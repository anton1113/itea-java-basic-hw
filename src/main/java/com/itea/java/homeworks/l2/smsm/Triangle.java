package com.itea.java.homeworks.l2.smsm;

public class Triangle {
    public static double perimeter(double l1, double l2, double l3) {
        return (l1+l2+l3);
    }
    public static double area(double l1, double l2, double l3) {
        double poluperimeter = perimeter(l1, l2, l3) / 2;
        return Math.sqrt(poluperimeter*(poluperimeter-l1)*(poluperimeter-l2)*(poluperimeter-l3));
    }
}
