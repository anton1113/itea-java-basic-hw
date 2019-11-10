package com.itea.java.homeworks.l2.denis;


import java.util.Scanner;

public class koren
{
    static double a, b, c;
    static double d;

    // C-подобное объявления массива в парметре
    public static void main(String args [])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Решение квадратного уровнения:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Ввелите a: ");
        a = in.nextDouble();
        System.out.println("Ввелите b: ");
        b = in.nextDouble();
        System.out.println("Ввелите c: ");
        c = in.nextDouble();

        d = b * b - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уровнения: x1 = " +  x1 + ", x2 = " + x2);
        }
        else if (d == 0){
            double x;
            x = -b / (2 * a);
            System.out.println("Уровнение имеет единственный корень: х = " + x);
        }
        else{
            System.out.println("Уровнение не имеет действительных корней!");
        }
    }
}