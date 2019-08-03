package com.company.laba7;

import com.company.laba6.Pen;

public class task15 {
    public static void main(String[] args) {
        Pen p = Pen.prepare();
        p.down();
        p.down();
        p.down();
        p.right();
        p.startLine();
        for (int i=1; i<=10; i++) {
            p.right();

        }
        int x=10;
        int y=9;
        for (int i=1; i<=5; i++) {

            for (int j=1; j<=x; j++) {
                p.down();
            }
            for (int j=1; j<=x; j++) {
                p.left();
            }
            for (int j=1; j<=y; j++) {
                p.up();
            }
            for (int j=1; j<=y; j++) {
                p.right();
            }
            x=x-2;
            y=y-2;

        }
    }
}
