package com.company.laba10;

import java.util.Scanner;

public class task22 {
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

        int n = 0;

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {
                if (j != i) {
                    if (arr[i] == arr[j]) {
                        arr[j] = 0;

                    }
                }
            }
        }
        int q=0;
        for (int i = 0; i < length; i++) {

            if(arr[i]==0) {
                q=q+1;

            }

        }
        int length2=length-q;
        int[] arr2;
        arr2 = new int[length2];
        int jj=0;

        for (int i=0; i<length; i++) {
            if(arr[i]!=0) {
                arr2[jj]=arr[i];
                jj++;
            }
        }
        for (int i=0; i<length2; i++) {
            System.out.print(arr2[i]+" ");
        }



    }
}
