package com.itea.java.homeworks.l2.pehov_alex;

import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                double a;
        System.out.println("Введите сумму в гривнах");
        a=sc.nextDouble();
        double b = 25;
        double c = a/b;
        System.out.println(a+ "гривны = " + c + " ДОЛЛАРЭСА");

    }
}