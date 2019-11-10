package com.itea.java.homeworks.l2.nick;

import java.util.Scanner; // импорт сканера

public class Kurs {

    public static void main(String args[]){
        System.out.print("Выберете в какую валюту перевод по кодировке 1-DOLLAR 2-YEWRO 3-RUBL 4-GRIVNA 5-FUNT : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.print("Выберете целую сумму в гривнах:  ");
        Scanner scan1 = new Scanner(System.in);
        int x = scan1.nextInt();

        /*
        Блок if/else тут перебирает значения переменной number, и выполняет определенные инструкции для каждого значения.
        Подходящее место для оператора switch.
         */
        if (number == 1 ){
            System.out.print("Ваша сумма в долларах: ");
            System.out.println(dollar((int) x));

        } else if (number == 2 ){
            System.out.print("Ваша сумма в евро: ");
            System.out.println(yewro((int) x)) ;

        } else if (number == 3 ){
            System.out.print("Ваша сумма в рублях: ");
            System.out.println(rubl((int) x)) ;

        } else if (number == 4 ){
            System.out.print("Ваша сумма в гривнах: ");
            System.out.println(x) ;


        } else if (number == 5 ){
            System.out.print("Ваша сумма в фунтах: ");
            System.out.println(funt((int) x)) ;}

        else {
            System.out.print("Неверная кодировка ");

        }


        // Форматирование кавычек. Кавычки нужно закрывать на том уровне, на котором был объявлен метод/класс, открывающий их.
            }

    /*
    Постарайся выбирать более значимые идентификаторы. Название метода должно коротко, но точно описывать его назначение.
    В идеале, долно быть понятно, что делает метод, даже если не читать его реализацию.
    Например, convertToFunt
     */
    private static int funt(int f) {
        /*
        Тут необходимо объявить константу. Литералы в коде без объяснения называются "magic numbers", это антипаттерн стиля кода.
        https://help.semmle.com/wiki/display/JAVA/Magic+numbers
         */
        return f/32;
    }

    private static int rubl(int r) {
        return r*3;
    }

    private static int yewro(int e) {
        return e/28;
    }

    private static int dollar(int i) {
        return i/24;
    }
}