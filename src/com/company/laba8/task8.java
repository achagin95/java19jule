package com.company.laba8;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");
        int length = arr.length;

        if (!t.isEmpty()) {
            if (length >= 3) {
                int j = 1;
                System.out.print("BEGIN " + arr[0] + " " + arr[1] + "\n");
                for (int i = 0; i < length - 2; i++) {
                    System.out.print(arr[i] + " " + arr[i + 1] + " " + arr[i + 2] + '\n');

                }
                System.out.print(arr[length - 2] + " " + arr[length - 1] + " END");
            }
            else if (length == 2){
                System.out.print("BEGIN " + arr[0] + " " + arr[1] + " \n");
                System.out.print( arr[0] + " " + arr[1] + " END");


            }
            else {
                System.out.print("BEGIN " + arr[0] + " END");
            }
        }
        else {
            System.out.print("Нет данных");
        }

    }
}
