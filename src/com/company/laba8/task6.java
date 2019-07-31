package com.company.laba8;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] arr = t.split(",");
        int i = arr.length;

        if (t.isEmpty()) {
            System.out.print(" ");
        }
        else {
            for (int j = i-1; j >= 0; j--) {
                System.out.print(arr[j] + " ");

            }
        }
    }
}
