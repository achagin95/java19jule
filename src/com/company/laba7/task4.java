package com.company.laba7;

import com.company.laba6.Pen;

public class task4 {
    public static void main(String[] args) {
        Pen p = Pen.prepare();
        p.down();
        p.down();
        p.down();
        p.right();
        p.startLine();
        p.right();
        p.right();
        p.right();
        p.up();
        p.right();
        p.down();
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 5; j++) {
                p.down();
            }
            p.right();
            for (int j = 0; j <= 5; j++) {
                p.up();
            }
            p.right();
            p.right();
            p.right();

        }
        for (int j = 0; j <= 5; j++) {
            p.down();
        }
        p.right();
        for (int j = 0; j <= 5; j++) {
            p.up();
        }
        p.right();
        for (int j = 0; j <= 6; j++) {
            p.down();
        }
        for (int i=1; i<=3; i++) {
            for (int j=1; j<=3; j++) {
                p.left();
            }
            for (int j=0; j<=5; j++) {
                p.up();
            }
            p.left();
            for (int j=0; j<=5; j++) {
                p.down();
            }
        }
        p.left();
        p.left();
        p.left();
        for (int j = 0; j <= 5; j++) {
            p.up();
        }
        p.left();
        p.left();
        p.left();
        p.up();

    }
}
