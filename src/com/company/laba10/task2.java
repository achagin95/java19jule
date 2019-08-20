package com.company.laba10;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a=x.nextInt();
        int b=x.nextInt();

        int rez=1;

        if (a>=b) {
            for (int i=b; i<=a; i++) {
                rez=rez*i;
            }
        } else {
            for (int i=a; i<=b; i++) {
                rez=rez*i;
            }
        }
        System.out.print(rez);
    }
}
