package com.itea.java.homeworks.l3.segii_golinko;

import java.util.Scanner;

public class Lection_3 {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
       // System.out.println(Max(1, 2));
       // PrintTen();
       // ZvorZapus();
       // System.out.println(NumberSimple(3));
       // Fact();
       DesiatvDviik();
       int pershe = SCANNER.nextInt();
       int dryge = SCANNER.nextInt();
       System.out.println(NaibSpilnDiln(pershe,dryge));
       LubayavDesiat();
       Vieta();

    }

   /* public static int Max(int a, int b) {
        return a > b ? a : b;
    }
    public static void PrintTen(){
        int number=10;
        while(number -- >0){
            System.out.println(+number);
        }
    }
    public static void ZvorZapus(){
        int number = SCANNER.nextInt();
        int reversedNumber=0;
        while (number>0){
            int lastnumber=number%10;
            reversedNumber=reversedNumber*10+lastnumber;
            number=number/10;
        }
        System.out.println(reversedNumber);
    }
    private static boolean NumberSimple(int number){
        for (int i = 0; i <number-1 ; i++) {
            if(number%(i+1)==0){
                return false;
            }
        }
        return true;
    }
    private static void Fact() {
        int number = SCANNER.nextInt();
        int facto = 1;
        for (int i = 0; i < number; i++) {
            facto = facto * (i + 1);
        }
        System.out.println(facto);
    }*/
    private static void DesiatvDviik(){
        int desiat =SCANNER.nextInt();
        int dviik=0;
        for (int i = 0; desiat >0 ; i++) {
         dviik=dviik+(desiat%2)*(int)Math.pow(10,i);
         desiat=desiat/2;
        }
        System.out.println(dviik);

    }
    private static int NaibSpilnDiln(int pershe, int dryge){
        while(pershe!=0 && dryge!=0){
            if(pershe>dryge){
              pershe=pershe%dryge;
            }
            else {
                dryge=dryge%pershe;
            }
        }
        return pershe+dryge;
    }
    private static void LubayavDesiat(){
        int systemaobchuslennia =SCANNER.nextInt();
        int chuslo =SCANNER.nextInt();
        int rezyltat=0;
        int i=0;
        while (chuslo>0){

            rezyltat=rezyltat+chuslo%10*(int)Math.pow(systemaobchuslennia,i++);
            chuslo=chuslo/10;
        }
        System.out.println(rezyltat);
    }
    private static void Vieta(){
        /*
        Рівняння x^2+b*x+c=0
        x1+x2=-b
        x1*x2=c
         */
        int b =SCANNER.nextInt();
        int c =SCANNER.nextInt();
        int x1=0;
        int x2=0;
        boolean ok=false;
        for (int i = -Math.abs(b); i <=Math.abs(b) ; i++) {
            x1=i;
            x2=(-b)-x1;
            if(x1*x2==c){
                ok=true;
                break;
            }
        }
        if(!ok){
            System.out.println("Rivniannia ne rozviazyetsia z dopomogou Vieta");
        }
        else {
            System.out.println(x1);
            System.out.println(x2);
        }
    }
    }
