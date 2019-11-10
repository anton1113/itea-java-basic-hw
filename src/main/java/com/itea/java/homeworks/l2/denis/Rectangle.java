package com.itea.java.homeworks.l2.denis;
import java.util.Scanner;
import java.lang.Math;
public class Rectangle
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
        int a = scan.nextInt();
        System.out.print("b= ");
        int b = scan.nextInt();
        if (a == 0 || b == 0 ) {
            System.out.println("Эти стороны не образуют прямоугольник");
            System.exit(0);
        }
        System.out.println("Perimeter:" + 2*(a + b));
        double p1 = (a * b);
        System.out.println("Area:" + p1);
    }
}