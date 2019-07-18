package com.company.laba6;
import java.util.Scanner;
public class task18 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int a=x.nextInt();
        for (int i=10; i<=20; i++) {
            if (i == a)
                System.out.println(i +"+");
            else
                System.out.println(i);
        }
    }
}
