package com.company.laba6;
import java.util.Scanner;
public class laba15 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        if (a<b) {
            for (; a<=b; a++) {
                System.out.print(a+ " ");
                            }
        }
        else if (a>b) {
            for (; b<=a; b++) {
                System.out.print(b+ " ");
            }
        }
        else {
            System.out.print("Границы равны \n"+a);
        }
    }
}
