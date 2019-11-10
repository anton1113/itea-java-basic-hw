package com.itea.java.homeworks.l2.smsm;

import java.util.Scanner;

public class Figure {
    public static void main (String args[]){
        System.out.println("Введите тип фигуры: 1 - ПРЯМОУГОЛЬНИК, 2 - ТРЕУГОЛЬНИК, 3 - ЭЛЛИПС ");
        Scanner scan_tip = new Scanner(System.in);
        int tipFigure = scan_tip.nextInt();
        switch (tipFigure){
            case 1:{
                System.out.println("Введите дину прямоугольника: ");
                Scanner scan_dlina = new Scanner(System.in);
                double dlina = scan_dlina.nextDouble();
                System.out.println("Введите ширину прямоугольника: ");
                // Не обязательно каждый раз заново инициализировать объект Scanner. Необходимо использовать уже созданный ранее.
                Scanner scan_shirina = new Scanner(System.in);
                double shirina = scan_shirina.nextDouble();
                System.out.println("Периметр прямоугольника равен: " + Rectangle.perimeter(dlina, shirina));
                System.out.println("Площадь прямоугольника равна: " + Rectangle.area(dlina, shirina));
                break;
            }
            case 2:{
                System.out.println("Введите длину первой стороны треугольника: ");
                Scanner scan_dlinaStorona1 = new Scanner(System.in);
                double dlinaStorona1 = scan_dlinaStorona1.nextDouble();
                System.out.println("Введите длину второй стороны треугольника: ");
                Scanner scan_dlinaStorona2 = new Scanner(System.in);
                double dlinaStorona2 = scan_dlinaStorona2.nextDouble();
                System.out.println("Введите длину третьей стороны треугольника: ");
                Scanner scan_dlinaStorona3 = new Scanner(System.in);
                double dlinaStorona3 = scan_dlinaStorona3.nextDouble();
                System.out.println("Периметр треугольника равен: " + Triangle.perimeter(dlinaStorona1, dlinaStorona2, dlinaStorona3));
                System.out.println("Площадь треугольника равна: " + Triangle.area(dlinaStorona1, dlinaStorona2, dlinaStorona3));
                break;
            }
            case 3:{
                System.out.println("Введите длину большой полуоси эллипса: ");
                Scanner scan_poluos1 = new Scanner(System.in);
                double poluos1 = scan_poluos1.nextDouble();
                System.out.println("Введите длину малой полуоси эллипса: ");
                Scanner scan_poluos2 = new Scanner(System.in);
                double poluos2 = scan_poluos2.nextDouble();
                System.out.println("Периметр треугольника равен: " + Oval.perimeter(poluos1, poluos2));
                System.out.println("Площадь эллипса равна: " + Oval.area(poluos1, poluos2));
                break;
            }
            default:{
                System.out.println("Сделан неверный выбор!");
            }
        }
    }
}
