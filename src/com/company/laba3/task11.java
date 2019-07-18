package com.company.laba3;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        int totalM, partCm;
        int  rez1, rez2;
        Scanner a = new Scanner (System.in);
        totalM=a.nextInt();
        partCm=a.nextInt();
        rez1=totalM*100/partCm;
        rez2=totalM*100%partCm;

        if (totalM>0 && partCm>0 && rez1 < 1)
            System.out.print("Материала не хватит даже на одно изделие");
        else if (totalM<0)
            System.out.print("Длина должна быть положительная");
        else if (partCm<0)
            System.out.print("Расход должен быть положительным");
        else {
                        System.out.print(rez1 + " шт и "+ rez2+" см " );
        }
    }

}
