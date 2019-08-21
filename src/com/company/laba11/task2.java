package com.company.laba11;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String data = x.nextLine();
        String a = "abcdefwxyz";

        int index = a.indexOf(data);
        if (index >= 0) {
            System.out.print(a.length() - index - 1);
        }
    }
}
