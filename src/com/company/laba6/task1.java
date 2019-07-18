package com.company.laba6;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int vsego = a.nextInt();

        System.out.println("Предисловие");
        int q;
        for (q=1; q<=vsego; q++){
            System.out.println("Глава " + q);

        }
        System.out.print("Послесловие");


    }
}
