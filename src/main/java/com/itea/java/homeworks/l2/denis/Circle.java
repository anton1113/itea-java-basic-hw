package com.itea.java.homeworks.l2.denis;
import java.util.Scanner;
import java.lang.Math;
public class Circle
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        int r = scan.nextInt();
        double area = Math.PI * (r * r);
        System.out.println("Площадь круга равна: " + area);
        double circl= Math.PI * 2*r;
        System.out.println("Длина окружности равна: " + circl);
    }
}