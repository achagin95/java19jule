package com.company.laba11;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String asd = "abcdacadbacdaabaadc";

        String data = x.nextLine();

        int length = data.length();

        if (length==2) {
            System.out.print(asd.replace(data," "));
        } else {
            System.out.print("Вводимая строка должна содержать ровно 2 символа");
        }


    }
}
