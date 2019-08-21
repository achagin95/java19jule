package com.company.laba11;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String t = "abcdefwxyz";

        String data=x.nextLine();

        if (t.contains(data)) {
            System.out.print("Содержится");
        } else {
            System.out.print("Не содержится");
        }
    }
}
