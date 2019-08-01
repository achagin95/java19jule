package com.company.laba9;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(";");

        int length = sarr.length;
        int[] arr;
        arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(sarr[i]);
        }

        for (int i = 0; i < length; i++) {
            if (arr[i] >= 0) {
                for (int j = 0; j < arr[i]; j++) {

                        System.out.print("#");

                }
            }
            else {
                System.out.print("Значение меньше нуля");

            }
            System.out.print("\n");
        }
    }
}
