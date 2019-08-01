package com.company.laba9;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);


        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(" ");
        int m;
        m=x.nextInt();
        int length = sarr.length;
        int [] arr;
        arr=new int[length];

        for (int i=0; i<length; i++) {
            arr[i]=Integer.parseInt(sarr[i]);
        }
        for (int i=0; i<length; i++) {
            arr[i]=arr[i]*m;
        }
        for (int i=0; i<length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
