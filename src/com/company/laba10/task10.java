package com.company.laba10;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(" ");
        if (!t.isEmpty()) {
            int length = sarr.length;

            double[] arr = new double[length];

            for (int i = 0; i < length; i++) {
                arr[i] = Double.parseDouble(sarr[i]);
            }

            double sa = 0;
            for (int i = 0; i < length; i++) {
                sa = sa + arr[i];
            }
            double saa;
            saa = sa / length;
            for (int i = 0; i < length; i++) {
                arr[i] = arr[i] - saa;
                if (arr[i] < 0) {
                    arr[i] = -arr[i];
                }
            }
            for (int i = 0; i < length; i++) {
                System.out.printf("%.4f", arr[i]);
                System.out.print(" ");
            }
        }
    }
}
