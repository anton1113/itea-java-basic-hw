package com.itea.java.homeworks.l2.natalia;

// 1. Конвертер валют
// 1.1. гривны в EUR
public class Converter {
    public static void main(String[] args) {
        double amountUan;
        System.out.println(convertToEuro(100000000));
        System.out.println(convertToEuro(5000));
        System.out.println(convertToEuro(70));
        System.out.println();
    }

    private static double convertToEuro(double amountUan) {
        final double RATIO = 27.7250;
        double v = amountUan / RATIO;
        return v;
    }

    private static double convertToUsd(double amountUan) {
        final double RATIO = 24.8728;
        double v = amountUan / RATIO;
        return v;
    }

    private static double convertToGbp(double amountUan){
        final double Ratio = 32.0369;
        double one = amountUan / Ratio;
        return one;
    }

    private static double convertToPln(double amountUan){
        final double Ratio = 6.4970;
        double two = amountUan / Ratio;
        return two;
    }

    private static double convertToJpy(double amountUan){
        final double Ratio = 0.2288;
        double one = amountUan / Ratio;
        return one;
    }
}



	
	


