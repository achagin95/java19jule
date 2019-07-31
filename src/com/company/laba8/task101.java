package com.company.laba8;

import java.util.Scanner;

public class task101 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");

        int length = arr.length;

        if (!t.isEmpty()) {
            String save = arr[length-1];
            for (int i=length-1; i>0; i--) {
                arr[i]=arr[i-1];

            }
            arr[0]=save;

            for (int i=0; i<length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        else {
            System.out.print("  ");
        }
    }
}
