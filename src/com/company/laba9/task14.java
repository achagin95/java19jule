package com.company.laba9;

import java.util.*;

public class task14 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] arr = t.split(",");

        int length = arr.length;

        for (int i=0;i<length; i++) {
            for (int j=0; j<length; j++) {
                if (i!=j) {
                    System.out.print(arr[i]+arr[j]+'\n');
                }
            }
        }
    }
}
