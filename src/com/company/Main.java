package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int udacha =0;
        int neUdachnyi =0;
        int neitral = 0;
        Random rd = new Random();
        String[] words = {"         ~\tMoi den ~ ",". | Podnimaius s krovati s levoi nogi",". | Podnimaius s krovati s pravoi nogi",". | Padaiu s krovati",
                               ". | Probejka po allee",". | Fiz.zariadka na balkone",". | Variu krepkiy koffee",". | Gotovliu plotnyi zavtrak",
                               ". | Dostaiu vcherashnyi salat",". | Spustilo koleso",". | Dobiraius na rabotu peshkom", ". | Dobiraius na rabotu na marshrutke",
                               ". | Dobiraius na rabotu na svoem avto",". | Prihoju vo vremia",". | Opazdyvaiu na ranotu",". | Konec" } ;
       System.out.println(words[0]);
        System.out.println("-----------------------------------------------------------");
        int a = rd.nextInt(1,3);
        if (a==1) {
            System.out.println(words[a]);
            neUdachnyi++;
            int b= rd.nextInt(1,10);
            if (b>=1 && b<=7){
                System.out.println(words[3]);
                neUdachnyi++;
            }
            else if (b>=8 && b<=10){
                System.out.println(words[4]);
                udacha++;
            }
            int e = rd.nextInt(1,12);
            if (e >=1 && e <=8){
                System.out.println(words[6]);
                udacha++;
            }
            else if (e >=9 && e<=12) {
                System.out.println(words[7]);
                udacha++;
            }

        }
        else if (a==2){
            System.out.println(words[2]);
            udacha++;
            int c = rd.nextInt(1,6);
            if (c >=1 && c <=4){
                System.out.println(words[4]);
                udacha++;
            }
            else if (c>=5 && c <=6){
                System.out.println(words[5]);
                udacha++;
                int d = rd.nextInt(1,4);
                if (d ==1){
                    System.out.println(words[7]);
                    udacha++;
                }
                else if (d>1 && d <=4){
                    System.out.println(words[8]);
                    neitral++;
                }
            }
        }
        int f = rd.nextInt(1,5);
        if (f >=1 && f <= 2){
            System.out.println(words[9]);
            neUdachnyi++;
            int g = rd.nextInt(1,8);
            if (g >= 1 && g<=2){
                System.out.println(words[10]);
                neUdachnyi++;
                int j = rd.nextInt(1,8);
                if (j >=1 && j <=2){
                    System.out.println(words[13]);
                    udacha++;
                }
                else if (j>=3 && j<=8){
                    System.out.println(words[14]);
                    neUdachnyi++;
                }
            }
            else if (g >= 3 && g <= 8){
                System.out.println(words[11]);
                neitral++;
                int i = rd.nextInt(1,3);
                if (i == 1){
                    System.out.println(words[13]);
                    udacha++;
                }
                else if (i == 2){
                    System.out.println(words[14]);
                    neUdachnyi++;
                }
            }
        }
        else if (f>=3 && f <=5){
            System.out.println(words[12]);
            udacha++;
            int k = rd.nextInt(1,8);
            if (k>=1 && k<=5){
                System.out.println(words[13]);
                udacha++;
            }
            else if (k >=6 && k<=8){
                System.out.println(words[14]);
                neUdachnyi++;
            }
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("       ~  Konetc dnya  ~     ");
        System.out.println();

        System.out.println("~  Udachnye sobytie : ("+udacha+")");
        System.out.println("~  Neudachnoe sobytie : ("+neUdachnyi+")");
        System.out.println("~  Neitralnoe sobytie : ("+neitral+")");
        if (udacha > neitral && udacha > neUdachnyi){
            System.out.println("V tcelom den :  Udachnyi");
        }
        else if (neUdachnyi>udacha && neUdachnyi>neitral){
            System.out.println("V tcelom den : Ne Udachnyi");
        }
        else {
            System.out.println("V tcelom den : Neitralno");
        }
    }
}
