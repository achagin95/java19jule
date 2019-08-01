package com.company.laba8;
import java.util.Scanner;
public class task14 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        String t = "";
        t = x.nextLine();
        String[] arr = t.split(" ");

        int length = arr.length;

        String[] save = new String[length/2];
        for (int i=0; i<length/2; i++) {
            save [i]=arr[i];
        }

        if (!t.isEmpty()) {
            int j=length-1;
            int jj=j;
            for (int i=0; i<length/2; i++) {
                arr[i]=arr[j];
                j--;
            }
            for (int i=0; i<length/2; i++) {
                arr[jj]=save[i];
                jj--;
            }


            for (int i=0; i<length; i++) {
                System.out.print(arr[i]);
            }

        }
    }

}
