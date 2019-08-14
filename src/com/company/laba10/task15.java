package com.company.laba10;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(" ");

        int length = sarr.length;
        int[] arr;
        arr = new int[length];


        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(sarr[i]);
        }

        int j = 1;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            if (j == 1) {
                System.out.print("Группа ");
            }
            System.out.print(arr[i] + " ");
            sum=sum+arr[i];
            if (j==3) {
                System.out.print(" сумма "+sum+"\n");
            }

            j++;
            if (j==4) {
                j=1;
                sum=0;
            }

        }
        if (j!=1) {

            System.out.print(" сумма "+sum+"\n");
        }
    }
}
