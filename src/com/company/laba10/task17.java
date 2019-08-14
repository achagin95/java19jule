package com.company.laba10;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t1 = "";
        t1 = x.nextLine();
        String[] sarr1 = t1.split(" ");
        String t2 = "";
        t2 = x.nextLine();
        String[] sarr2 = t2.split(" ");

        int length1 = sarr1.length;
        int length2 = sarr2.length;


        if (!t1.isEmpty() && !t2.isEmpty()) {
            System.out.print("  ");
            for (int i = 0; i < length1; i++) {
                System.out.print(sarr1[i] + " ");
            }
            System.out.print("\n");
            for (int i = 0; i < length2; i++) {
                System.out.print(sarr2[i] + " ");
                for (int j = 0; j < length1; j++) {
                    if (sarr1[j].equals(sarr2[i])) {
                        System.out.print("+ ");

                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("|\n");
            }
            System.out.print(" ");
            for (int i = 0; i < length1; i++) {
                System.out.print("--");

            }
        }
        else if (t1.isEmpty()) {
            System.out.print("Данные сверху отсутствуют");
        } else {
            System.out.print("Данные слева отсутствуют");
        }

    }
}
