package com.company.laba11;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String asd = "abcdefwxyz";

        int ca = x.nextInt();
        int cb = x.nextInt();

        int length = asd.length();

        if (ca >= 0 && cb >= 0 && ca < length && cb < length && ca + cb <= length) {
            int n = ca + cb;

            System.out.print(asd.substring(0, ca) + asd.substring(n, length));

        } else if (ca + cb >= length) {
            System.out.print("Сумма значений CA и CB должна быть меньше длины строки");
        } else if (ca < 0 || ca > length) {
            System.out.print("Значение CA должно быть в интервале [0, длина строки)");
        } else {
            System.out.print("Значение CB должно быть неотрицательно");
        }


    }
}
