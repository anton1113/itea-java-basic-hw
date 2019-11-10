package com.itea.java.homeworks.l2.denis;

import java.util.Scanner;

public class Currens {

    public static void main(String[] args) {
             final Scanner scanner = new Scanner(System.in);
             System.out.print("UAH: ");
             int uah = scanner.nextInt();

            System.out.print("EURO: ");
            System.out.println(convertToEuro(uah));
            System.out.print("USD: ");
            System.out.println(convertToUsd(uah));
            System.out.print("RUB: ");
            System.out.println(converttoRub(uah));
        }

         private static double convertToEuro(double uahAmount) {
            final double RATIO = 27.6696;
            return uahAmount / RATIO;
         }
         private static double convertToUsd(double uahAmount) {
            final double RATIO = 24.6696;
            return uahAmount / RATIO;
    }
         private static double converttoRub(double uahAmount){
            final double RATIO = 0.39;
            return uahAmount / RATIO;
        }
    }

