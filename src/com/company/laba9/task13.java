package com.company.laba9;

import java.util.*;

public class task13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");

        String n = "";
        n = x.nextLine();
        String[] sarr = n.split(" ");

        if (!t.isEmpty() && !n.isEmpty()) {
            int length = sarr.length;
            int len = arr.length;

            if (length == len) {


                int[] iarr;
                iarr = new int[length];

                for (int i = 0; i < length; i++) {
                    iarr[i] = Integer.parseInt(sarr[i]);
                }

                //for (int i = 0; i < length; i++) {
                //    if (i <= iarr[])
                //}
            } else {
                System.out.print("Длины массивов не совпадают");
            }
        } else if (t.isEmpty()) {
            System.out.print("Отсутствуют данные о символах");
        } else {
            System.out.print("Отсутствуют данные о количествах");
        }
    }


}
