package com.company.laba8;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");
        int S = x.nextInt();
        String tmp;

        int length = arr.length;
        if (!t.isEmpty()) {
            if (S > 0) {
                for (int i = 1; i <= S; i++) {
                    tmp = arr[length - 1];
                    for (int j = length - 1; j >= 1; j--) {
                        arr[j] = arr[j - 1];

                    }
                    arr[0] = tmp;
                }
                for (int i = 0; i < length; i++) {
                    System.out.print(arr[i]);
                }

            } else if (S < 0) {
                for (int i = S; i < 0; i++) {
                    tmp = arr[0];
                    for (int j = 0; j < length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[length - 1] = tmp;
                }
                for (int i = 0; i < length; i++) {
                    System.out.print(arr[i]);
                }
            } else {
                for (int i = 0; i < length; i++) {
                    System.out.print(arr[i]);
                }
            }

        }
    }
}
