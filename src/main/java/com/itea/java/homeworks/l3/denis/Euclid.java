package com.itea.java.homeworks.l3.denis;
import java.util.Random;
public class Euclid {

    public static void main(String[] args) {
	Random RANDOM = new Random();
        for (int i = 0; i < 10; i++) {
            int a = RANDOM.nextInt(100);
            int b = RANDOM.nextInt(100);
            System.out.println("НОД(" + a + "," + b + ") = " + getEuclidGCD(a,b));

        }
    }
    private static int getEuclidGCD (int a, int b){
        int bigger;
        int smaller;
        if (a > b){
            bigger = a; smaller = b;
        } else {
            bigger = b; smaller = a;
        }
        while (smaller > 0){
            int remainder = bigger % smaller;
            bigger = smaller;
            smaller = remainder;
        }
        return bigger;
    }
}
