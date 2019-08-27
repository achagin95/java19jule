package com.company.laba11;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String data = x.nextLine();

        data = data.trim();

        data = data.toLowerCase();

        //String datasp = data;
        int length = data.length();

        /* while (data.contains(" ")) {
            String replase=data.replace(" ","");
            data=replase;
        }
        System.out.println(data);
        System.out.println(datasp);

        String[] t2 = new String[length];
        String a;
        for (int i = 0; i < length; i++) {
            a = datasp.substring(i, i + 1);
            t2[i] = a;
        }

        for (int i=0; i<length; i++) {

        } */
        int index1 = 0;
        //index2, index3;
        int indexnum = 0;

        for (int i = 0; i < length; i++) {
            if (data.substring(i, i + 1).equals("<") || data.substring(i, i + 1).equals(">")) {
                index1 = i;
                indexnum = indexnum + 1;

            }
        }

        //System.out.println(index1);
        //System.out.println(indexnum);
        int index2 = 0;
        int indexnum2 = 0;
        if (indexnum == 1 && index1 > 0) {
            String sravnenie;
            if (data.substring(index1, index1 + 1).equals("<")) {
                sravnenie = "меньше числа";
            } else if (data.substring(index1, index1 + 1).equals(">")) {
                sravnenie = "больше числа";
            } else {
                sravnenie = "eror";
            }

            String dataleft = data.substring(0, index1);

            dataleft = dataleft.trim();
            int lengthleft = dataleft.length();
            for (int i = 0; i < lengthleft; i++) {
                if (data.substring(i, i + 1).equals(" ")) {
                    index2 = i;
                    indexnum2++;
                }
            }
            if (dataleft.isEmpty()) {
                System.out.print("Слева от знака сравнения ожидается переменная");

            } else if (indexnum2 > 0) {
                String[] sarr = dataleft.split(" ");
                int lenthsarr = sarr.length;

                System.out.print("Неожиданное выражение ");
                for (int i = 0; i < lenthsarr - 1; i++) {
                    System.out.print(sarr[i] + " ");
                }
                System.out.print("слева от переменной \"" + sarr[lenthsarr - 1] + "\"");
            } else {
                String dataright;
                int indexnumR = 0;

                for (int i = 0; i < length; i++) {
                    if (data.substring(i, i + 1).equals("=")) {
                        indexnumR++;

                    }
                }
                if (indexnumR == 0) {
                    dataright = data.substring(index1 + 1, length);
                } else {
                    dataright = data.substring(index1 + 2, length);
                    if (sravnenie.equals("меньше числа")) {
                        sravnenie = "меньше или равно числу";
                    } else {
                        sravnenie = "больше или равно числу";
                    }
                }

                int index3 = 0;
                int indexnum3 = 0;
                dataright = dataright.trim();
                int lengthrigth = dataright.length();
                for (int i = 0; i < lengthrigth; i++) {
                    if (data.substring(i, i + 1).equals(" ")) {
                        index3 = i;
                        indexnum3++;
                    }
                }
                if (dataright.isEmpty()) {
                    System.out.print("Справа от знака сравнения ожидается ограничение");
                } else {
                    if (indexnum3 > 0) {
                        String[] sarr2 = dataright.split(" ");
                        int lenthsarr2 = sarr2.length;

                        System.out.print("Неожиданное выражение ");
                        for (int i = 1; i < lenthsarr2; i++) {
                            System.out.print(sarr2[i] + " ");
                        }
                        System.out.print("справа от переменной \"" + sarr2[0] + "\"");
                    } else {
                        System.out.print("Значение переменной " + dataleft + " " + sravnenie + " " + dataright);
                    }


                }
            }
        } else if (indexnum > 1) {
            System.out.print("В выражении должен быть только один знак сравнения");

        } else if (indexnum == 0) {
            System.out.print("Отсутствует знак сравнения");
        } else {
            System.out.print("Слева от знака сравнения ожидается переменная");
        }


    }
}
