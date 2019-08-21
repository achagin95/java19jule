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
        double sk=0;
        for (int i=0; i<length; i++){

        sk=sk+(double)arr[i];
        }
        sk=sk/length;
        System.out.print(sk+ "\n");
        double skk=0;

        for (int i=0; i<length; i++) {
            double a=arr[i]-sk;
            skk=skk+(a*a);
        }




        double rez=Math.sqrt(skk/(length-1));
        System.out.printf("%.4f",rez);
    }
}
