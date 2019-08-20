package com.company.laba10;

public class task3 {
    public static void main(String[] args) {
        int rez=0;
        int ii;
        System.out.print("Ход решения ");
        for (int i=20; i<=40; i++) {
            ii=i*i*i;
            System.out.print(rez+" + " + ii+" = ");
            rez=rez+(i*i*i);
            System.out.print(rez +" ");
            if (i%5==0) {
                System.out.print("\n");
            }

        }
        System.out.print("\nОтвет "+rez);
    }

}
