package com.company.laba11;
import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);


        String data = x.nextLine();
        int length = data.length();

        String a1 = data.substring(0, 1);
        String a2 = data.substring(length-1);
        String b = "\"";


        if (a1.equals(b)&& a2.equals(b)) {
            data=data.substring(1,length-1);
            data=data.trim();
            System.out.print(data);

        } else {
            System.out.print("Строка должна начинаться и заканчиваться кавычкой");
        }
    }
}
