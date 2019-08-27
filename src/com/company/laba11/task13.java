package com.company.laba11;
import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String ca = x.nextLine();

        int length = ca.length();
        String data = ",";

        int num=0;
        int index;

        for (int i=0; i<length; i++) {

            index = ca.indexOf(data, i);
            if (index<0) {
                break;
            }
            i=index;
            num++;


        }
        System.out.print(num+1);
    }
}
