package com.company.laba6;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int y = x.nextInt();

        if (y>=0) {

            for (int i = 1; i<=y; i++) {
                System.out.print("#");

                if (i%20==0) {
                    System.out.print("\n");

                }
            }
        }
        else {
            System.out.print("Значегие должно быть положительным");
        }
    }
}
