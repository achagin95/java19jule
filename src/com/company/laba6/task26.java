package com.company.laba6;
import java.util.Scanner;
public class task26 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();

        if (y>=0 && y<=15) {
            for (int i=1; i<=y; i++) {
                System.out.print("#");
            }
            for (int i=y; i<15; i++) {
                System.out.print(".");
            }
        }
        else {
            System.out.print("Значение должно быть в пределах от 0 до 15");
        }
    }
}
