package com.company.laba11;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String data = x.nextLine();

        int length = data.length();

        String a;
        int q = 0;



        for (int i = 0; i < length; i++) {
            a = data.substring(i, i + 1);

            if (a.equals("{")) {
                q++;
                System.out.print(q);
            } else if (a.equals("}")) {
                System.out.print(q);
                q--;
            }
        }

        if (q%2==1) {
            System.out.print(" Неожиданный конец строки");
        }
        if (q<0) {
            System.out.print(" Неожиданный символ \'}\'");
        }

    }
}
