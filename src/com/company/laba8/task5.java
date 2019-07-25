package com.company.laba8;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] arr = t.split(",");
        int i = arr.length;
        int glava = 1;
        if (t.isEmpty()) {
            System.out.print(" ");
        }
        else {
            for (int j = 0; j < i; j++) {
                System.out.print("Глава " + glava + " " + arr[j] + "\n");
                glava++;
            }
        }


    }
}
