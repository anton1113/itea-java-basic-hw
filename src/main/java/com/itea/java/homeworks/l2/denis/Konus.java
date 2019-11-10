package com.itea.java.homeworks.l2.denis;
import java.util.Scanner;
import java.lang.Math;
public class Konus
{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        int rad = scan.nextInt();
        System.out.print("Высота : ");
        int h = scan.nextInt();
        double s = Math.PI * rad * (rad + Math.pow(( Math.pow(rad, 2.0) + Math.pow(h, 2.0)), .5));
        double v = Math.PI*rad*rad*h/3;
        System.out.println("площадь равна: "+s);
        System.out.println("объем равен: "+v);
    }
}
