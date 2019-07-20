package com.company.laba6;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        boolean a = false;

        if (y > 0) {
            for (int i = 2; i < y; i++) {
                if (y % i == 0) {
                    a = true;
                    break;
                }
            }
            if (a == false) {
                System.out.print("Число простое");
            } else {
                System.out.print("Число не простое");
            }
        } else {
            System.out.print("Число должно быть больше 0");
        }
    }
}
