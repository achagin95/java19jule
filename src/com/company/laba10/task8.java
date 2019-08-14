package com.company.laba10;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();

        int count = 0;

        for (int i = 1; i <= t; i++) {
            if (t % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.print("\nЧисло " + t + " без остатка делится на " + count + " других чисел. ");
        if (count == 2 || count==1) {
            System.out.print(" Число простое.");
        } else {
            System.out.print("Число не простое");
        }


    }
}
