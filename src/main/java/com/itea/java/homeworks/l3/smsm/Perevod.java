package com.itea.java.homeworks.l3.smsm;

import java.util.Scanner;
class Perevod {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите число для перевода: 1 - Из двоичной в десятичную, 2 - Из десятичной в двоичную");
        Scanner scan_chislo = new Scanner(System.in);
        int chislo = scan_chislo.nextInt();
        switch (chislo){
            case 1:{
                System.out.println("Введите число для перевода 2->10");
                Scanner scan_chislo1 = new Scanner(System.in);
                int chislo1 = scan_chislo1.nextInt();
                System.out.println(from2to10(chislo1));
                break;
            }
            case  2:{
                System.out.println("Введите число для перевода 10->2");
                Scanner scan_chislo2 = new Scanner(System.in);
                int chislo2 = scan_chislo2.nextInt();
                from10to2(chislo2);
                break;
            }
            default:{
                System.out.println("Выбор неверен!");
            }
        }


    }

    private static int from2to10(int number) {

        int value = number;
        int result = 0;

        int length = (int)Math.log10( value );

        for (int i = 0; i <= length; i++) {

            int a = value % 10;
            value /= 10;

            result += a * (int)Math.pow( 2.0, (double)i );
        }

        return result;
    }

    // Рекурсия с побитовым сдвигом сдвигом - это красиво)
    private static void from10to2(int number) {
            int news;

            if (number <= 1) {
                System.out.print(number);
                return;
            }

            news = number % 2;
            from10to2(number >> 1);
            System.out.print(news);

    }
}