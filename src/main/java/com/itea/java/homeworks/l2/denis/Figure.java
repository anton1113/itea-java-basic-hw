package com.itea.java.homeworks.l2.denis;
import java.util.Scanner;
import java.lang.Math;
public class Figure
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
        int a = scan.nextInt();
        System.out.print("b= ");
        int b = scan.nextInt();
        System.out.print("c= ");
        int c = scan.nextInt();
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Эти стороны не образуют треугольника");
            System.exit(0);
        }
        System.out.println("Perimeter:" + (a + b + c));
        double p1 = (a + b + c) / 2.0;
        System.out.println("Area:" + Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c)));
    }
}