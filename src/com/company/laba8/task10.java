package com.company.laba8;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t1 = "";
        String t2 = "";
        t1 = x.nextLine();
        String[] arr1 = t1.split(" ");
        t2 = x.nextLine();
        String[] arr2 = t2.split(" ");

        int length1 = arr1.length;
        int length2 = arr2.length;
        int j = 1;

        if (length1 == length2) {

            for (int i = 0; i < length1; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    System.out.print("Массивы начинают различаться на индексе " + i);
                    j = 0;
                    break;
                }
            }

        } else if (length1 >= length2) {
            for (int i = 0; i < length2; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    System.out.print("Массивы начинают различаться на индексе " + i);
                    j = 0;
                    break;
                }
            }
            if (j==1) {
                System.out.print("Массивы начинают различаться на индексе " + length2);
                j=0;
            }
        }
        else {
            for (int i = 0; i < length1; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    System.out.print("Массивы начинают различаться на индексе " + i);
                    j = 0;
                    break;
                }
            }
            if (j==1) {
                System.out.print("Массивы начинают различаться на индексе " + length1);
                j=0;
            }
        }
        if (j == 1) {
            System.out.print("Массивы иденичны");
        }
    }
}
