package com.itea.java.homeworks.l3.denis;

import java.util.Scanner;

public class Chisla {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите число: ");
	    int number = SCANNER.nextInt();

        System.out.println("В двоичной: " + Integer.toBinaryString(number));
        System.out.println("В восьмиричной: " + Integer.toOctalString(number));
        System.out.println("В шестнадцатиричную: " + Integer.toHexString(number));
    }
}
