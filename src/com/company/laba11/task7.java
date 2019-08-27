package com.company.laba11;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String asd = x.nextLine();

        int length = asd.length();

        if (length==13) {
            System.out.println("Код страны изготовителя: "+ asd.substring(0,2));
            System.out.println("Код изготовителя: "+ asd.substring(3,6));
            System.out.println("Код товара: "+ asd.substring(7,11));
            System.out.println("Контрольное число: "+ asd.substring(12));

        }

    }
}
