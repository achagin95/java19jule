package com.company.laba8;

import java.util.Scanner;
// сдвиг влево (на дом сдвиг в право)
public class task12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");
        int length = arr.length;
        if (!t.isEmpty()) {
            String save = arr[0];
            for (int i=0; i<length-1; i++) {
                arr[i]=arr[i+1];

            }
            arr[length-1]=save;

            for (int i=0; i<length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        else {
            System.out.print("  ");
        }
    }
}
