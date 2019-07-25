package com.company.laba8;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");
        int b = x.nextInt();
        int e = x.nextInt();


        int length = arr.length;

        if (b>=0 && e>=0 && e<=length) {
            for (int i=b; i<=e; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else {
            System.out.print("Значение должно быть  в интервале от 0 до Е ");
        }

    }
}
