package com.company.laba9;

import java.util.*;

public class task12 {
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
        int tmp;
        //int qwe=1;
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i < length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }

            }
            for (int i = 0; i < length - 1; i++) {
                if (arr[i]>arr[i+1]) {
                    j=0;
                    break;
                } else {
                    j=3;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
        }
    }
}
/* есть два варианта (этот и когда мы просто крутим цикл по колличеству элементов)
в данном случае при лучшем варианте мы выигрываем, при среднем одинакого, а при худшем делаем в 2 раза больше действий,
чем при работе второго варианта, который во всех случаях делает все по колличеству элементов массива.
 */