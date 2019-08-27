package com.company.laba11;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String asd = "abcabcabbacbacbaaac";
        String data1 = x.nextLine();

        int length = asd.length();
        int length2 = data1.length();


        if (length2 == 2) {

            for (int i = 0; i < length; i++) {
                int index1 = asd.indexOf(data1, i);
                i = index1;
                if (index1 == -1) {
                    break;
                }
                System.out.print(index1 + " ");

            }
        }
        else {
            System.out.print("Вводимая строка должна содержать ровно 2 символа");
        }
    }
}
