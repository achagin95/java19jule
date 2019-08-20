package com.company.laba10;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(" ");

        int q = x.nextInt();
        int p = x.nextInt();


        int length = sarr.length;
        int[] arr;
        arr = new int[length];


        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(sarr[i]);
        }
        int qwe=length-1;

        if (q >= 0 && q <= length-1 && p >= 0 && p <= length-1) {
            if (q < p) {
                int min = arr[q];
                System.out.print("Фрагмент массива: ");
                for (int i = q; i <= p; i++) {
                    System.out.print(arr[i] + " ");
                    if (min > arr[i]) {
                        min = arr[i];
                    }

                }
                System.out.print("\n Минимальное среди них: "+min);
            }

            if (q > p) {
                int min = arr[p];
                System.out.print("Фрагмент массива: ");
                for (int i = p; i <= q; i++) {
                    System.out.print(arr[i] + " ");
                    if (min > arr[i]) {
                        min = arr[i];
                    }

                }
                System.out.print("\n Минимальное среди них: "+min);
            }
        }

        else if (p<0 || p>=length) {
            System.out.print("Число P должно быть в интервале [0, "+qwe+"]");
        }
        else {
            System.out.print("Число Q должно быть в интервале [0, "+qwe+"]");
        }

    }
}
