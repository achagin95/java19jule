package com.company.laba10;

import java.util.Scanner;

public class task13 {
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
        int min = arr[0];
        for (int i = 0; i < length - 1; i++) {

            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }

        }
        for (int i=0; i<length; i++) {
            arr[i]=arr[i]-min;
            System.out.print(arr[i]+" ");
        }

    }


    }
