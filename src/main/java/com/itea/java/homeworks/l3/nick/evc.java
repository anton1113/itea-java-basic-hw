package com.itea.java.homeworks.l3.nick;

import java.util.Scanner;

public class evc {
    public static void main(String[] args) {
        System.out.println("Вы считаете НОД");
        System.out.print("Выберете первое число ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.print("Выберете второе число ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();
        System.out.println(evk(a,b)) ;
    }

    private static int evk(int Q ,int W) {
        while (W !=0) {
            int l = Q%W;
            Q = W;

            W = l;
        }
        return Q;
    }
    }





