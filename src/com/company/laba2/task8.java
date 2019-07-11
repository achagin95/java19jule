package com.company.laba2;
import java.util.*;


public class task8 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        float aDeg = a.nextFloat();

        float aRad;

        aRad= (float)(aDeg*Math.PI/180);

        System.out.printf("%.4f",aRad);


    }
}
