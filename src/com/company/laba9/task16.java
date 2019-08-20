package com.company.laba9;

import java.util.*;

public class task16 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] arr = t.split(",");

        int length = arr.length;

        String[] aa;
        aa = new String[]{"а", "б", "в", "г", "д", "е", "ж", "з", "и", "к"};
        String[] bb;
        bb = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int length2 = 10;

        System.out.print(" ");

        int ii = 0;
        //int byk=0;
        //int cif=0;







            for (int i = 0; i < length2; i++) {
                System.out.print(aa[i]);
            }
            System.out.print("\n");
            for (int i = 0; i < length2; i++) {
                System.out.print(bb[i]);
                for (int j = 0; j < length2; j++) {
                    ii = 0;
                    for (int q = 0; q < length - 1; q = q + 2) {
                        if (arr[q].equals(aa[j]) && arr[q + 1].equals(bb[i])) {
                            System.out.print("#");
                            ii = 1;
                            break;
                        }
                    }
                    if (ii == 0) {
                        System.out.print(" ");
                    }

                }
                System.out.print("|\n");
            }
            System.out.print(" ");
            for (int i = 0; i < length2; i++) {
                System.out.print("-");
            }
            System.out.print(" ");

    }


}

