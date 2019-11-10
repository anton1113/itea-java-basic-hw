package com.itea.java.homeworks.l2.nick;

import java.util.Scanner; // импорт сканера

public class figura3d {
    public static void main(String args[]){
        System.out.print("Хотите посчитать обьем: 1 - Да  ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 1) {
          System.out.print("Выберете вашу фигуру: 1 - КУБ   2 - ШАР  3 - КОНУС  4 -  ЦИЛИНДР  5 - ПРЯМОУГОЛЬНЫЙ ПАРАЛЕЛЕПИПЕД");
          Scanner scan1 = new Scanner(System.in);
          int figura  = scan1.nextInt();

          System.out.print("Введите ДЛИНУ СТОРОНЫ ( пока достаточно одну ) или  РАДИУС (для шара) ");
          Scanner scan2 = new Scanner(System.in);
          int x = scan2.nextInt();

          if ((number == 1) && (figura == 1)){
              System.out.print("Ваш обьем куба: ");
              System.out.println(o3k(x));

          } else if ((number == 1) && (figura == 2)){
              System.out.print("Ваш обьем шара: ");
              System.out.println(o3r(x)) ;

          } else if ((number == 1) && (figura == 3)){
              System.out.println("Считаем обьем конуса: ");
              System.out.println(o3ko(x)) ;

          } else if ((number == 1) && (figura == 4)){
              System.out.println("Считаем обьем цилиндра: ");
              System.out.println(o3qo(x)) ;

          } else if ((number == 1) && (figura == 5)){
              System.out.println("Считаем обьем паралелепипеда: ");
              System.out.println(o3papar(x)) ;

          }
          else {
              System.out.print("Выход: ");
          }


    }}


    private static int o3papar(int x) {
        System.out.print("Введите сторону B: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        System.out.print("Введите сторону С: ");
        Scanner scan2 = new Scanner(System.in);
        int с = scan2.nextInt();
        return x*b*с;
    }

    private static double o3qo(int x) {
        System.out.print("Введите высоту цилиндра: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        return 3.14*x*x*b;
    }

    private static double o3ko(int x) {
        System.out.print("Введите высоту конуса: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        return (3.14*b*x*x)/3;
    }

    private static double o3r(int x) {
        return (4/3)*3.14*x*x;
    }

    private static int o3k(int x) {
        return x*x*x;
    }


}