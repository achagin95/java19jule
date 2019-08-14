package com.company.laba10;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String t = "";
        t = x.nextLine();
        String[] sarr = t.split(" ");

        int length = sarr.length;
        int[] arr;
        arr = new int[length];


        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(sarr[i]);
        }
        int min=arr[0];
        System.out.print("Ход решени:\n" +"Начинаю с "+ arr[0]+"\n");
        for (int i=0; i<length-1; i++) {
            System.out.print("Сравниваю "+min+" c "+arr[i+1]+"\n");
            if (min>arr[i+1]) {
                min=arr[i+1];
                System.out.print("Заменяю\n");
            }
        }
        System.out.print("В массиве { ");
        for (int i=0; i<length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("} Минимальный элемент это "+min);
    }
}
