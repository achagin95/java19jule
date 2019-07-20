package com.company.laba6;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        int j;

        if (a >= 0 && b >= 0) {
            j=0;
            if (a > b) {
                for (int i = 0; i <= a; i++) {
                    if (i <= b) {

                        System.out.println(i + "   " + j);
                        j++;
                    } else {
                        System.out.println(i + "   ");
                    }

                }
            }
            else if (b >= a) {
                for (int i = 0; i <= b; i++) {
                    if (i <= a) {

                        System.out.println(j + "  " + i);
                        j++;
                    } else {
                        System.out.println("   " +i );
                    }

                }
            }
        }
        else if (a<0 && b<0){
            System.out.print("Значение а и b должно быть положительным");
        }
        else if (a<0){
            System.out.print("Значение а должно быть положительным");
        }
        else {
            System.out.print("Значение b должно быть положительным");
        }
    }
}

