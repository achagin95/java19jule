package com.company.laba10;

import java.util.Scanner;

public class task221 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(" ");
        int length = sarr.length;


        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {
                if (sarr[i] != null) {
                    if (j != i) {
                        if (sarr[i].equals(sarr[j])) {
                            sarr[j] = null;
                        }
                    }
                }
            }
        }
        int q = 0;
        for (int i = 0; i < length; i++) {

            if (sarr[i] == null) {
                q = q + 1;

            }

        }
        int length2 = length - q;
        String[] arr2;
        arr2 = new String[length2];
        int jj = 0;

        for (int i = 0; i < length; i++) {
            if (sarr[i] != null) {
                arr2[jj] = sarr[i];
                jj++;
            }
        }
        for (int i = 0; i < length2; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
