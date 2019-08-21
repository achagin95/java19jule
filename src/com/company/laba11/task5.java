package com.company.laba11;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String asd = "abcdefwxyz";

        //String data1 = x.nextLine();
        //String data2 = x.nextLine();

        //int index1 = asd.indexOf(data1);
        //int index2 = asd.indexOf(data2);

        int length = asd.length();

        int ca = x.nextInt();
        int cb = x.nextInt();

        if (ca >= 0 && cb >= 0 && ca<length &&cb<length) {
            if (ca <= cb) {
                String a = asd.substring(ca, cb+1);
                System.out.print(a);
            } else {
                String a = asd.substring(cb, ca+1);
                System.out.print(a);
            }
        } else if (ca<0 || ca >length) {
            System.out.print("начение СА должно быть в интервале [ 0, "+(length)+" )");
        } else {
            System.out.print("начение СB должно быть в интервале [ 0, "+(length)+" )");
        }

    }
}
