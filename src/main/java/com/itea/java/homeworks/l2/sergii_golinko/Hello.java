package com.itea.java.homeworks.l2.sergii_golinko;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        System.out.println("Korin rivniannia x1");
        System.out.println(Korinx1(1,2,3));
        System.out.println("Korin rivniannia x2");
        System.out.println(Korinx2(1,2,3));
        System.out.println("Kurs dollara do hruvni");
        System.out.println(KursDollara(1000));
        System.out.println("Kurs euro do hruvni");
        System.out.println(KursEuro(500));
        System.out.println("Kurs rublia do hruvni");
        System.out.println(KursRubl(35));
        System.out.println("Perumetr priamokytnuka");
        System.out.println(PerumPriam(2,3));
        System.out.println("Ploscha priamokytnuka");
        System.out.println(PloschaPriam(2,1));
        System.out.println("Perumetr kryga");
        System.out.println(PerumKryg(3));
        System.out.println("Ploscha kryga");
        System.out.println(PloschaKryg(3));
        System.out.println("Ploscha culindra");
        System.out.println(PloschaCulindr(2,2));
        System.out.println("Obem culindra");
        System.out.println(ObemCulindr(1,2));
        System.out.println("Ploscha shara");
        System.out.println(PloschaShar(2));
        System.out.println("Obem shara");
        System.out.println(ObemShar(2));
        //Scanner scaner = new Scanner(System.in);
             //   int number1 = scaner.nextInt();
       // int number2 = scaner.nextInt();
       // System.out.println(+(number1+number2));

            }

  public static double Korinx1(double a, double b, double c){
        double d;
d=b*b-4*a*c;
return (-b+Math.sqrt(b))/2*a;
  }
    public static double Korinx2(double a, double b, double c){
        double d;
        d=b*b-4*a*c;
        return (-b-Math.sqrt(b))/2*a;
    }
    public static double KursDollara(double dol){
        final double kurs=24.9;
        return dol/kurs;
    }
    public static double KursEuro(double eur){
        final double kurs=31.3;
        return eur/kurs;
    }
    public static double KursRubl(double rub){
        final double kurs=0.5;
        return rub/kurs;
    }
    public static int PerumPriam(int storona1, int storona2){
        return 2*(storona1+storona2);

    }
    public static int PloschaPriam(int storona1, int storona2){
        return storona1*storona2;
    }
    public static double PerumKryg(double radius){
        final double pi=3.14;
        return 2*pi*radius;
    }
    public static double PloschaKryg(double radius){
        final double pi=3.14;
        return pi*radius*radius;
    }
    public static double PloschaCulindr(double radius, double vusota){
        final double pi=3.14;
        return 2*pi*radius*radius+2*pi*radius*vusota;
    }
    public static double ObemCulindr(double radius, double vusota){
        final double pi=3.14;
        return pi*radius*radius*vusota;
    }
    public static double PloschaShar(double radius){
        final double pi=3.14;
        return 4*pi*radius*radius;
    }
    public static double ObemShar(double radius){
        final double pi=3.14;
        return 4*pi*radius*radius*radius/3;
    }
}
