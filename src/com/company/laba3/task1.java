package com.company.laba3;


import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int edge=a.nextInt();
        int area;
        if (edge>=0) {
            area=6*edge*edge;
            System.out.print(area);



        }
        else System.out.print("Значение edge должно быть положительным");
    }
}
