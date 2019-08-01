package com.company.laba8;

import java.util.Scanner;


public class task11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");
        int p = x.nextInt();
        int q = x.nextInt();

        int length = arr.length;
        if (p>=0 && q>=0 && q<=length && p<=length) {
            System.out.print("Меняю " + arr[p]+ " на " +arr[q]+"\n");
            String save=arr[p];
            arr [p]=arr[q];
            arr [q] = save;

            for (int i=0; i<length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        else {
            System.out.print("Значение должно быть  в интервале от 0 до Е ");
        }
    }
}
