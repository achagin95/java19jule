package com.company.laba10;

public class task1 {
    public static void main(String[] args) {
        int sum=100;
        System.out.print(sum+" ");

        for (int i=101; i<=500; i++) {
            sum=sum+i;
            System.out.print(sum+" ");
            if (i%50==0) {
                System.out.print("\n");
            }
        }
        System.out.print("\nОтвет "+sum);
    }
}
