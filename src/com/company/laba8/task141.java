package com.company.laba8;

import java.util.Scanner;

public class task141 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");

        int length = arr.length;
        if (!t.isEmpty()) {
            String tmp;
            int j = length - 1;
            for (int i = 0; i < length/2; i++) {

                tmp = arr[i];
                arr[i] = arr[j];
                arr [j] = tmp;
                j--;

            }
            for (int i=0; i<length; i++) {
                System.out.print(arr[i]);
            }


        }
    }
}
