package com.company.laba7;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String s = x.nextLine();
        int h = x.nextInt();


        if (h==0) {
            System.out.print(" ");

        }
        else if (h<0){
            System.out.print("Значение h должно быть положительным");
        }
        else {
            for (int i=1; i<=h; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print(s);

                }
                System.out.print("\n");

            }
        }




    }
}
