package com.company.laba3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        int edge=a.nextInt();
        int heigh=a.nextInt();
        float area;
        if (edge>0 && heigh>0) {
            area=(float)edge*(float)heigh/2;
            System.out.print(area);



        }
        else if (edge<=0) {
            System.out.print("Основание треугольника должно быть положительным");
        }
        else System.out.print("Высота треугольника должнa быть положительным");
    }
}
