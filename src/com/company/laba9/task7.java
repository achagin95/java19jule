package com.company.laba9;

import java.util.Scanner;

public class task7 {
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

            for (int i = 0; i < length2; i++) {
                arr2[i] = Integer.parseInt(sarr2[i]);
            }
            int j;


            for (int i = 0; i < length2; i++) {
                j = arr2[i];
                if (length1 - 1 >= j) {
                    System.out.print(arr1[j] + "\n");
                } else {
                    System.out.print("Элемент на позиции " + j + " отсутствует\n");
                }
            }
        }
        else if (t1.isEmpty()) {
            System.out.print("Отсутствуют данные о фрагментах");
        }else {
            System.out.print("Отсутствуют данные о индексах");
        }


    }
}
