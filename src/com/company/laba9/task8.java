package com.company.laba9;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t1 = "";
        t1 = x.nextLine();
        String[] arr1 = t1.split(" ");
        String t2 = "";
        t2 = x.nextLine();
        String[] sarr2 = t2.split(" ");

        int length1 = arr1.length;

        int length2 = sarr2.length;
        int[] arr2 = new int[length2];

        if (!t1.isEmpty() && !t2.isEmpty()) {

            if (length1 == length2) {
                for (int i = 0; i < length2; i++) {
                    arr2[i] = Integer.parseInt(sarr2[i]);
                }

                for (int i=0; i<length2; i++) {
                    for (int j=1; j<=arr2[i]; j++) {
                        System.out.print(arr1[i]);
                    }
                    System.out.print("\n");
                }


            } else {
                System.out.print("Длины массивов не совпадают");
            }
        }
        else if (t1.isEmpty()) {
            System.out.print("Отсутствуют данные о фрагментах");
        }else {
            System.out.print("Отсутствуют данные о индексах");
        }
    }
}