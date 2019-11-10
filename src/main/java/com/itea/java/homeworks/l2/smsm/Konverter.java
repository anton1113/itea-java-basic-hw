package com.itea.java.homeworks.l2.smsm;

import java.util.Scanner;

public class Konverter {

    // Форматирование. Отступы и табы не влияют на работу программ, но от них сильно зависит сложность чтения кода.
    // В данном методе лишний таб.
        public static void main(String args[]){

            System.out.print("Введите сумму конвертации:  ");
            Scanner scan1 = new Scanner(System.in);
            int summa = scan1.nextInt();

            System.out.println("1. Доллар - Гривна");
            System.out.println("2. Гривна - Доллар");
            System.out.println("3. Евро - Гривна");
            System.out.println("4. Гривна - Евро");
            System.out.println("5. Евро - Доллар");
            System.out.println("6. Доллар - Евро");
            System.out.println("Выберите вариант конвертации:  ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();

            // Возможно, тут лучше подойдет switch.
            if (number == 1 ){
                System.out.print("Ваша сумма в гривнах: ");
                System.out.println(dollarGrivna(summa));

            } else if (number == 2 ){
                System.out.print("Ваша сумма в долларах: ");
                System.out.println(grivnaDollar(summa));

            } else if (number == 3 ){
                System.out.print("Ваша сумма в гривнах: ");
                System.out.println(evroGrivna(summa));

            } else if (number == 4 ){
                System.out.print("Ваша сумма в евро: ");
                System.out.println(grivnaEvro(summa)) ;

            } else if (number == 5 ){
                System.out.print("Ваша сумма в долларах: ");
                System.out.println(evroDollar(summa)) ;

            } else if (number == 6 ){
                System.out.print("Ваша сумма в евро: ");
                System.out.println(dollarEvro(summa)) ;}

            else {
                System.out.print("Неверный выбор ");

            }
        }


    // Идентификаторы. В джаве переменные, имя которых состоит из нескольких слов, пишутся через CamelCase.
    // Например, dollarG
    private static int dollarGrivna(int dollar_g) {
            /*
        Тут необходимо объявить константу. Литералы в коде без объяснения называются "magic numbers", это антипаттерн стиля кода.
        https://help.semmle.com/wiki/display/JAVA/Magic+numbers
         */
        return dollar_g * 25;
    }

    // Имена методов должны коротко, но точно описывать, что делает метод. С этим хорошо справляются названия, содержащие глагол:
    // convertHrivnaToDollar
    private static double grivnaDollar(int grivna_d) {
        return grivna_d / 25.0;
    }

    private static int evroGrivna(int evro_g) {
        return evro_g * 28;
    }

    private static double grivnaEvro(int grivna_e) {
            return grivna_e / 28.0;
        }

    private static double evroDollar(int evro_d) {
        return evro_d * 1.12;
    }

    private static double dollarEvro(int dollar_e) {
        return dollar_e * 0.9;
    }

    }