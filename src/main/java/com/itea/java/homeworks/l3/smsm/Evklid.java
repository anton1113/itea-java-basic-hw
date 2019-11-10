package com.itea.java.homeworks.l3.smsm;

import java.util.Scanner;

public class Evklid {

    public static void main(String[] args) throws Exception { // throws Exception тут не нужен. Разберемся на след. лекциях.
        System.out.print("Введите первое целое число: ");
        Scanner scan_chislo1 = new Scanner(System.in);
        int chislo1 = scan_chislo1.nextInt();

        System.out.print("Введите второе целое число: ");
        Scanner scan_chislo2 = new Scanner(System.in);
        int chislo2 = scan_chislo2.nextInt();

        System.out.println(nod(chislo1, chislo2));
    }

    // В Объектно Ориентированном программировании принято указывать настолько ограниченный доступ к полям/методам/классам,
    // насколько это возможно. Отсюда и предупреждение, что поле может быть private.
    public static int nod(int number1, int number2) {
        while (number2 !=0) {
            int number3 = number1%number2;
            number1 = number2;
            number2 = number3;
        }
        return number1;
    }
}