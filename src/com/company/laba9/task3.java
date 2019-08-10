package com.company.laba9;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t1 = "";
        t1 = x.nextLine();
        String[] sarr1 = t1.split(" ");
        String t2 ="";
        t2 = x.nextLine();
        String [] sarr2 = t2.split(" ");

        int length1 = sarr1.length;
        int[] arr1;
        arr1 = new int[length1];

        int length2 = sarr2.length;
        int [] arr2 = new int[length2];

        if (length1==length2) {
            for (int i = 0; i < length1; i++) {
                arr1[i] = Integer.parseInt(sarr1[i]);
            }
            for (int i = 0; i < length2; i++) {
                arr2[i] = Integer.parseInt(sarr2[i]);
            }

            for (int i=0; i< length1; i++) {
                int rez;
                rez = arr1[i]*arr2[i];
                System.out.print(rez+ " ");
            }
        }
        else {
            System.out.print("Размеры массивов должны быть одинаковы");
        }

    }
}
