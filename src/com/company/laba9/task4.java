package com.company.laba9;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(",");

        int length = sarr.length;
        int[] arr;
        arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(sarr[i]);
        }

        for (int i=0; i< length-1; i=i+2) {
            if (arr[i]>=19 && arr[i+1]<=19) {
                System.out.print("От "+arr[i+1]+" до "+arr[i]+"\n");
            }
            else if (arr[i]<=19 && arr[i+1]>=19) {
                System.out.print("От "+arr[i]+" до "+arr[i+1]+"\n");
            }

        }
    }
}
