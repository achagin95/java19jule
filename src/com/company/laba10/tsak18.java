package com.company.laba10;
import java.util.Scanner;
public class tsak18 {
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

        if (!t1.isEmpty()&& !t2.isEmpty()) {
            int sum=0;
            for (int i=0; i<length1; i++) {
                for (int j=0; j<length2; j++) {
                    if (sarr1[i].equals(sarr2[j])) {
                        sum=sum+1;
                    }
                }
            }
            System.out.print("Повторений: "+sum);
        }

    }
}
