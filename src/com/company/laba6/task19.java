package com.company.laba6;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int j = 0;
        for (int i = 0; i <= a; i++) {

            System.out.println(i + " - " + j);
            j++;
                    if (j==4) {
                        j=0;
                    }

        }
        if (a<0) {
            System.out.println("Значение должно быть не отрицательным");
        }
    }
}
