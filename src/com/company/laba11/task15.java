package com.company.laba11;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String data = x.nextLine();

        int length = data.length();

        String a;
        int q = 0;
        if (!data.isEmpty()) {
            for (int i = 0; i < length; i++) {
                a = data.substring(i, i + 1);

                if (a.equals("\"")) {
                    q++;
                    if (q % 2 == 0) {
                        data = data.replaceFirst("\"", "]");

                    } else {
                        data = data.replaceFirst("\"", "[");
                    }
                }
                if (a.equals("[")||a.equals("]")) {

                }

            }
            System.out.print(data);
        }

    }
}
