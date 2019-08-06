package com.company.laba9;

import java.util.*;

public class task9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(";");

        int length = sarr.length;
        int[] arr;
        arr = new int[length];
        if (!t.isEmpty()) {
            for (int i = 0; i < length; i++) {
                arr[i] = Integer.parseInt(sarr[i]);
            }
            int q = 1;
            for (int i = 0; i < length-1; i++) {

                if (arr[i] > arr[i + 1]) {
                    System.out.print("Элемент со значением " + arr[i + 1] + " На инжексе " + (i + 1) + " нарушает закономерность");
                    q = 0;
                    break;


                }

            }
            if (q == 1) {
                System.out.print("Значения отсортированы по возрастанию");
            }
        } else {
            System.out.print("Исходная строка пуста");
        }

    }
}
