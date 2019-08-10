package com.company.laba8;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");

        int length =arr.length;

        String[] arr2=new String[length];

        int j=1;
        int ii=0;
        int iii=0;

        for (int i=0; i<length; i++) {
            if (j%2==0) {
                arr2[ii]=arr[i];
                ii++;
            }
            else {
                arr2[length/2+iii]=arr[i];
                iii++;
            }
            j++;
        }

        for (int i=0; i<length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
