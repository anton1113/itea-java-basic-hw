package com.itea.java.homeworks.l3.nick;

import java.util.Scanner;
// импорт сканера


class Test {
    public static void main(String[] args) {
        System.out.print("Выберете тип перевода :   1 - из ДВОИЧНОЙ в ДЕСЯТИЧНУЮ   2 - из ПЯТИРИЧНОЙ в ДЕСЯТИЧНУЮ  3 - из ДЕСЯТИЧНОЙ В СЕМИРИЧНУЮ 4 - из ПЯТИРИЧНОЙ в СЕМИРИЧНУЮ   " );
        Scanner scan3 = new Scanner(System.in);
        int kek = scan3.nextInt();

        if (kek == 1){
            int sum = 0, a;
            System.out.print("Введите свое число в ДВОИЧНОЙ системе исчисления:    ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            String stroka = String.valueOf(number);
            int len = stroka.length();
            char c;
            // Несколько пустых строк подряд мешают читать код. Поработаем над форматированием.




            for(int i = 0;  len > i; i++){
                c = stroka.charAt(stroka.length() - 1 - i);

                if(c == '1' || c == '0') {
                    if (c == '1')
                        a = 1;
                    else a = 0;
                } else {
                    System.out.println("Неверный ввод!");
                    break;
                }
                sum += (a * vozvedenie(2, i));
            }

            System.out.println("\"" + stroka +" в двоичной это "+ " = " + sum +"  в десятичной");



        }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        else if (kek == 2){
            System.out.print("Введите свое число в ПЯТИРИЧНОЙ системе исчисления:    ");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            System.out.println(P510(number));

            }
        else if (kek == 3){
            System.out.print("Введите свое число в ДЕСЯТИЧНОЙ системе исчисления:    ");
            Scanner scanN = new Scanner(System.in);
            int number = scanN.nextInt();
            System.out.println(P710(number));

        }
        else if (kek == 4){
            System.out.print("Введите свое число в ПЯТИРИЧНОЙ системе исчисления:    ");
            Scanner scanN = new Scanner(System.in);
            int number = scanN.nextInt();
            System.out.println(P710(P510(number)));
        }






        }



    private static int P510(int q) {
        int value = q;
        int result = 0;

        int length = (int)Math.log10( value );

        for (int i = 0; i <= length; i++) {

            int a = value % 10;
            value /= 10;

            result += a * (int)Math.pow( 5.0, (double)i );
        }

        return result;
    }




    private static int vozvedenie(int a, int b) {
        int result = 1;
        for (int i=1; i<=b; i++){
            result = result*a;
        }
        return result;
    }

    private static int P710(int number) {

        int value = number;

        String result = "";

        while ( value % 7 > 0 ) {

            int p = value / 7;
            int q = value % 7;

            result = q + result;

            value = p;
        }

        return Integer.parseInt( result );
    }


}




