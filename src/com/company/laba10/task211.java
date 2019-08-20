package com.company.laba10;
import java.util.Scanner;
public class task211 {
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

        int[] arr2;
        arr2 = new int[length];

        for (int i=0; i<length; i++) {
            int sum=1;
            for (int j=0; j<length;j++) {
                if (j!=i) {
                    if (arr[i] == arr[j]) {
                        sum=sum+1;
                    }
                }
            }
            arr2[i]=sum;

        }
        for (int i=0; i<length; i++) {
        System.out.print(arr2[i]+" ");}
    }
}
