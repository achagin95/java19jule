package com.company.laba6;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        if(y>0) {

            for (int i = 1; i <= y/2; i++) {
                if (y % i == 0) {
                    System.out.print(i + " ");
                }

            }
            System.out.print(y);
        }
        else {
            System.out.print("Значение должно быть больше 0");
        }

    }
}