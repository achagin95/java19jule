package com.company.laba11;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String[] asd = new String[]{"А", "Б", "В", "Г", "Д","Е","Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У",
        "Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ы","Ь","Э","Ю","Я","1","2","3","4","5","6","7","8","9","0"};
        String[] mor = new String[]{".-", "-...", ".--", "--.", "-..",".","...-","--..","..",".---","-.-",".-..","--","-.",
                "---",".--.",".-.","...","-","..-",
                "..-.","....",".-.-","---.","----","--.-","--.--","-.--","..-..","..-..","..--",".-.-",".----",
                "..---","...--","....-",".....","-....","--...","---..","----.","-----"};


        String t = x.nextLine();
        t = t.trim();

        t = t.toUpperCase();


        int length = t.length();
        int LengthM = asd.length;

        String[] t2 = new String[length];
        String a;
        for (int i = 0; i < length; i++) {
            a = t.substring(i, i + 1);
            t2[i] = a;
        }
        int num = 0;
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < LengthM; j++) {
                if (t2[i].equals(asd[j])) {
                    num = j;
                    break;
                } else if (t2[i].equals(" ")){
                    num=-2;
                    break;
                }
                num = -1;
            }
            if (num >= 0) {
                System.out.print(mor[num] + " ");
            } else if (num==-2) {
                System.out.print(" ");
            } else {
                System.out.print("? ");
            }
        }


    }
}
