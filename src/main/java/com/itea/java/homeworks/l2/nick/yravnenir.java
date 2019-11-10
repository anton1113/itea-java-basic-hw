package com.itea.java.homeworks.l2.nick;

import java.util.Scanner;

public class yravnenir {

    public static void main(String args[]) {
        System.out.print("Выберете каким способом решать уравнение: 1 Дискриминант  2 Виет ");

        // Можно не создавать каждый раз объект типа Scanner, а повторно использовать созданный ранее.
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.print("Выберете число А: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.print("Выберете число B: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        System.out.print("Выберете число С: ");
        Scanner scan3 = new Scanner(System.in);
        int c = scan3.nextInt();

        if (number == 1) {
            System.out.println("Ваше решение по дискриминанту: ");
            int dis = discriminant(a, b, c);
            if (dis < 0) {
                System.out.print("Решений нет ");

            } else if (dis == 0) {
                int s1 = (int) Math.sqrt(dis);
                int x11 = (-b) / (2 * a);
                System.out.println(x11);

            } else if (dis > 0) {
                int s1 = (int) Math.sqrt(dis);
                int x11 = (-b - s1) / (2 * a);
                int x12 = (-b + s1) / (2 * a);
                System.out.println(x12);
                System.out.println(x11);

            }
        }
        else if (number == 2){
            System.out.print("Ваше решение по Виетта: " );
            viet(b, c);
        }
    }

    // Идентификаторы методов будут более понятными, если будут сожержать глагол.
    // Например, computeDiscriminant
    private static int discriminant(int a1, int b1, int c1 ) {
        int D = b1*b1-4*a1*c1;
        return D;
    }

    private static void viet(int b2, int c2) {
        // Названия локалных переменных приняно начинать с маленькой буквы.
        // В данном случае, можно просто присвоить новое значение параметру, вместо объявления новой переменной.
        // c2 = Math.abs(c2)
        int C1 = Math.abs(c2);
        int B1 = Math.abs(b2);
        int x1 = 0;
        int x2 = 0;

        for (int i = -(B1 * C1); i < (B1 * C1); i++) {

            for (int j = -(C1 + B1); j < (C1 + B1); j++) {

                if ((c2 == i * j) && (-b2 == i + j)) {
                    x1 = i;
                    x2 = j;
                }
            }
        }

        if (x1 == 0 && x2 == 0)
            System.out.println("Нельзя вычислить / Неверные значения");
        else System.out.println("Первый корень = " + x1 + ", " + "Второй корень = " + x2);

    }
}


