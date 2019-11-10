package com.itea.java.homeworks.l2.nick;

import java.util.Scanner; // импорт сканера

public class Figura {
    public static void main(String args[]){
        System.out.print("Выберете что вы хотите посчитать: 1 - ПЕРИМЕТР  2 - ПЛОЩАДЬ : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.print("Выберете вашу фигуру: 1 - КВАДРАТ  2 - ТРЕУГОЛЬНИК  3 - КРУГ 4 - ПРЯМОУГОЛЬНИК 5  - ТРЕУГОЛЬНИК СО СВОИМИ СТОРОНАМИ ");
        Scanner scan1 = new Scanner(System.in);
        int figura  = scan1.nextInt();

        System.out.print("Введите ДЛИНУ СТОРОНЫ ( если стороны разные, то сейчас достаточно ввести только одну из них )  или  РАДИУС (для круга) ");
        Scanner scan2 = new Scanner(System.in);
        int x = scan2.nextInt();

        if ((number == 1) && (figura == 1)){
            System.out.print("Ваш периметр квадрата: ");
            System.out.println(perimetrkv(x));

        } else if ((number == 1) && (figura == 2)){
            System.out.print("Ваш периметр треугольника: ");
            System.out.println(perimetrtr(x)) ;

        } else if ((number == 1) && (figura == 3)){
            System.out.print("Ваша длина окружности : ");
            System.out.println(perimetrkr(x)) ;

        } else if ((number == 1) && (figura == 4)){
            System.out.print("Ваш периметр : ");
            System.out.println(perimetrpryam(x));

        } else if ((number == 1) && (figura == 5)){
            System.out.println("Считаем ваш периметр : ");
            System.out.println(perimetrprt3(x));

        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        else if ((number == 2) && (figura == 1)){
            System.out.print("Ваша площа квадрата: ");
            System.out.println(ploshakv(x)) ;


        } else if ((number == 2) && (figura == 2)){
            System.out.print("Ваша площа трикутника: ");
            System.out.println(ploshatr(x)) ;
        }

        else if ((number == 2) && (figura == 3)){
            System.out.print("Ваша площадь круга: ");
            System.out.println(ploshakr(x)) ;

        } else if ((number == 2) && (figura == 4)){
            System.out.print("Ваша площадь прямоугольника: ");
            System.out.println(ploshpr(x)) ;

        } else if ((number == 2) && (figura == 5)){
            System.out.println("Считаем вашу площадь треугольника: ");
            System.out.println(ploshtr3(x)) ;

        }

        else {
            System.out.print("Неверная кодировка: ");
        }


    }

    private static int ploshtr3(int x) {
        System.out.print("Введите вторую сторону B для треугольника: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        System.out.print("Введите третью сторону С для треугольника: ");
        Scanner scan1 = new Scanner(System.in);
        int c = scan1.nextInt();

        System.out.print("Введите радиус вписанной окружности, без него вычисление невозможно: ");
        Scanner scan3 = new Scanner(System.in);
        int r = scan3.nextInt();
        return ((x+b+c)/2)*r;
    }

    private static int perimetrprt3(int x) {
        System.out.print("Введите вторую сторону B для треугольника: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        System.out.print("Введите третью сторону С для треугольника: ");
        Scanner scan1 = new Scanner(System.in);
        int c = scan1.nextInt();

        return x+b+c;
    }

    private static int ploshpr(int x) {
        System.out.print("Введите вторую сторону B для прямоугольника: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        return x*b;
    }

    private static int perimetrpryam(int x) {
        System.out.print("Введите вторую сторону B для прямоугольника: ");
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        return (x+b)*2;
    }

    private static double ploshakr(int x) {
        return 3.14*x*x;
    }

    private static int ploshatr(int x) {
        return (int) (x * x * Math.sqrt(3.0) / 4);
    }

    private static int ploshakv(int x) {
        return x*x;
    }

    private static int perimetrkv(int x) {
        return x*4;
    }

    private static int perimetrtr(int x) {
        return x*3;
    }

    private static double perimetrkr(int x) {
        return x*2*3.14;
    }


}