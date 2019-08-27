package com.company.laba11;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String asd = x.nextLine();

        String a = asd.substring(0, 1);


        if (a.equals("s")) {
            System.out.print(asd.toLowerCase());
        } else if (a.equals("U")) {
            System.out.print(asd.toUpperCase());
        } else {
            System.out.print(asd);
        }
    }
}
