package com.itea.java.homeworks.l2.smsm;

import java.util.Scanner;

public class Korni {
    public static void main (String args[]){
        System.out.print("Введите первый коэффициент A:  ");
        Scanner scan_koefficient1 = new Scanner(System.in);
        double koefficient1 = scan_koefficient1.nextDouble();
        System.out.print("Введите второй коэффициент B:  ");
        Scanner scan_koefficient2 = new Scanner(System.in);
        double koefficient2 = scan_koefficient2.nextDouble();
        System.out.print("Введите третий коэффициент C:  ");
        Scanner scan_koefficient3 = new Scanner(System.in);
        double koefficient3 = scan_koefficient3.nextDouble();
        double d = (discriminant(koefficient1, koefficient2, koefficient3));
        if (d>0){
            double X1 = ((-1)*koefficient2 + Math.sqrt(d)) / (2*koefficient1);
            double X2 = ((-1)*koefficient2 - Math.sqrt(d)) / (2*koefficient1);
            System.out.println("Х1= " + X1);
            System.out.println("Х2= " + X2);
        }
        else if (d<0){
            System.out.print("Уравнение в действительных числах решений не имеет!");
        }
        else {
            double X = (-1)*koefficient2 / (2*koefficient1);
            System.out.println("Х= " + X);
        }
    }

    private static double discriminant(double a, double b, double c){

        return (b*b) - (4*a*c);
    }

}