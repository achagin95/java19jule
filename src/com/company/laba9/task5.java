package com.company.laba9;
import java.util.*;

public class task5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String vvod = x.nextLine();
        String [] arr = new String[]{"a","b","c","d","e","f","g","h"};

        int length=arr.length;

        for (int i=0; i<length; i++) {
            if (arr[i].equals(vvod)) {
                System.out.print(arr[i]+"+"+"\n");
            }
            else {
                System.out.print(arr[i]+"\n");
            }
        }
    }
}
