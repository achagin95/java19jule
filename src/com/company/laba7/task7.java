package com.company.laba7;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int w = x.nextInt();
        int h = x.nextInt();
        if (w > 0 && h > 0) {
            System.out.print(" ");

            for (int i = 0; i <= w; i++) {
                System.out.print(i);
            }
            System.out.print("\n");
            for (int j = 0; j <= h; j++) {
                System.out.print(j);
                for (int i = 0; i <= w; i++) {
                    System.out.print(".");
                }
                System.out.print("|\n");


            }
            System.out.print(" ");
            for (int i = 0; i <= w; i++) {
                System.out.print("-");

            }

        }
        else if (w==0 || h==0) {
            System.out.print(" ");
        }


        else if (w<0) {
            System.out.print("Значение W должно быть положительным");
        }
        else  {
            System.out.print("Значение H должно быть положительным");
        }
    }
}
