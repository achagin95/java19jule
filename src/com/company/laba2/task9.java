package com.company.laba2;


import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        float aDeg = a.nextFloat();

        float aRad;

        aRad= (float)(aDeg*Math.PI/180);

        float rez;
        rez=(float)(Math.sin(aRad));

        System.out.printf("%.4f",rez);
    }

}
