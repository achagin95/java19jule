package com.company.laba7;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();


        if (a < b) {
            for (int i = a; i < b - 1; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + ", ");
                }
            }
            if ((b - 1)% 2  == 1) {
                System.out.print(b - 1);
            } else if (b % 2 == 1) {
                System.out.print(b);
            }
        }
        else if (a>b) {
            for (int i = a; i > b + 1; i--) {
                if (i % 2 == 1) {
                    System.out.print(i + ", ");
                }
            }
            if ((b + 1)% 2  == 1) {
                System.out.print(b + 1);
            } else if (b % 2 == 1) {
                System.out.print(b);
            }
        }

    }
}
