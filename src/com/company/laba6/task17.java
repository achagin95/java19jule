package com.company.laba6;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();

        if (a > b) {
            int j=a;
            for (int i = b; i <= a; i++) {
                System.out.println(i + "  " + j);
                j--;

            }
            int vsego;
            vsego = a-b+1;
            System.out.println("Всего строк " + vsego);
        }
        if (b >= a) {
            int j=b;
            for (int i = a; i <= b; i++) {
                System.out.println(i + "  " + j);
                j--;

            }
            int vsego;
            vsego = b-a+1;
            System.out.println("Всего строк " + vsego);
        }
    }
}
