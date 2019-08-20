package com.company.laba10;

import java.util.Scanner;

public class task16 {
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

            int sum1 = 0;
            int sum2 = 0;
            if (length != 1) {

                if (length % 2 == 0) {
                    System.out.print("Числа на четных позициях: ");
                    for (int i = 0; i < length - 1; i = i + 2) {
                        System.out.print(arr[i] + " ");
                        sum1 = sum1 + arr[i];
                    }
                    System.out.print(" Сумма: " + sum1);
                    System.out.print("\nЧисла на нечетных позициях: ");
                    for (int i = 1; i < length; i = i + 2) {
                        System.out.print(arr[i] + " ");
                        sum2 = sum2 + arr[i];
                    }
                    System.out.print(" Сумма: " + sum2);

                } else {
                    System.out.print("Числа на четных позициях: ");
                    for (int i = 0; i < length; i = i + 2) {
                        System.out.print(arr[i] + " ");
                        sum1 = sum1 + arr[i];
                    }
                    System.out.print(" Сумма: " + sum1);
                    System.out.print("\nЧисла на нечетных позициях: ");
                    for (int i = 1; i < length - 1; i = i + 2) {
                        System.out.print(arr[i] + " ");
                        sum2 = sum2 + arr[i];
                    }
                    System.out.print(" Сумма: " + sum2);

                }
            } else {
                System.out.print("Числа на четных позициях: " + arr[0]);
                System.out.print(" Сумма: " + arr[0]);
                System.out.print("\nЧисла на нечетных позициях: .");
                System.out.print(" Сумма: " + "0");
            }
        } else {
            System.out.print("Нет данных");
        }


    }
}
