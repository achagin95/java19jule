package com.company.laba7;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();


        if (a >= 0 && a <= 20) {
            for (int j = 0; j <= 9; j++) {
                for (int i = 1; i <= a; i++) {
                    System.out.print(j);
                }
                System.out.print("\n");

            }
        } else
            System.out.println("Значение должно быть в пределах от 0 до 20");
    }
}
