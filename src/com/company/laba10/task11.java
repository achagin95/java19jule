package com.company.laba10;
import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(" ");

        int length = sarr.length;

        int[] arr = new int[length];

        for (int i=0;i<length; i++) {
            arr[i]=Integer.parseInt(sarr[i]);

        }
        int sk=0;
        for (int i=0; i<length; i++){

        sk=sk+arr[i];
        }
        sk=sk/length;

        for (int i=0; i<length; i++) {
            arr[i]=arr[i]-sk;
        }
        int skk=0;
        for (int i=0; i<length; i++) {
            skk=skk+(arr[i]*arr[i]);

        }

        double rez=Math.sqrt(skk/length);
        System.out.printf("%.4f",rez);
    }
}
