package com.company.laba10;

import java.util.Scanner;

// System.out.printf("%.4f",rez);

public class task9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(" ");

        int length = sarr.length;
        int[] arr;
        arr = new int[length];

        if (!t.isEmpty()) {
            for (int i = 0; i < length; i++) {
                arr[i] = Integer.parseInt(sarr[i]);
            }


            int sum = 0;

            for (int i = 0; i < length; i++) {
                sum = sum + arr[i];

            }
            float avg = ((float) sum) / length;
            System.out.printf("%.6f", avg);


        }
        else {
            float avg=0;
            System.out.printf("%.6f", avg);
        }
    }
}
