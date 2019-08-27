package com.company.laba11;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String asd = "abcdefwxyz";

        String ca = x.nextLine();
        String cb = x.nextLine();


        int index1 = asd.indexOf(ca);
        int index2 = asd.indexOf(cb);

        if (index1 >= 0 && index2 >= 0) {
            if (index1 <= index2) {
                String a = asd.substring(index1 + 1, index2);
                System.out.print(a);
            } else {
                String a = asd.substring(index2 + 1, index1);
                System.out.print(a);
            }
        } else if (index1 < 0) {
            System.out.print("Значение CA отсутствует в строке");
        } else {
            System.out.print("Значение CB отсутствует в строке");
        }
    }
}
