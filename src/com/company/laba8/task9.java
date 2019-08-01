package com.company.laba8;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        char[] arr = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        int length = arr.length;

        String a = x.nextLine();
        char z = a.charAt(0);


        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]);
            if (z == arr[i])
                break;
        }


    }
}
