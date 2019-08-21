package com.company.laba11;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String asd = "abcdefwxyz";
        String data1 = x.nextLine();
        String data2 = x.nextLine();

        int index1=asd.indexOf(data1);
        int index2=asd.indexOf(data2);

        if (index1>=0 &&index2>=0) {
            if (index1<=index2) {
                System.out.print(index2-index1-1);
            } else {
                System.out.print(index1-index2-1);
            }
        }
        else if (index1<0) {
            System.out.printf("Значение CA отсутствует в строке");
        } else {
            System.out.printf("Значение CB отсутствует в строке");
        }

    }
}
