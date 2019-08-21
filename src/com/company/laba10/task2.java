package com.company.laba10;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        long a=x.nextLong();
        long b=x.nextLong();

        long rez=1;

        if (a>=b) {
            for (long i=b; i<=a; i++) {
                rez=rez*i;
            }
        } else {
            for (long i=a; i<=b; i++) {
                rez=rez*i;
            }
        }
        System.out.print(rez);
    }
}
