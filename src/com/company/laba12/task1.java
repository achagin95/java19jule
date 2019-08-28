package com.company.laba12;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int data=x.nextInt();
        int q=1;
        int sum=data;
        while (data !=0) {
            data=x.nextInt();
            q++;
            sum=sum+data;
        }
        System.out.print("Сумма чисел: "+ sum+", Количество чисел: "+q);
    }
}
