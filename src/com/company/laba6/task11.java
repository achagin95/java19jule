package com.company.laba6;


public class task11 {
    public static void main(String[] args) {
        Pen p = Pen.prepare();
        p.down();
        p.down();
        p.down();
        p.right();
        p.startLine();
        p.right();
        p.down();
        p.right();
        p.up();
        p.right();
        p.down();
        p.down();
        for (int i = 0; i <= 5; i++) {
            p.right();
        }
        p.up();
        p.up();
        p.left();
        p.up();
        p.right();
        p.right();
        for (int i = 0; i <= 8; i++) {
            p.down();
        }
        for (int i=1; i<=3; i++) {

            p.left();
            p.up();
            p.up();
            p.up();
            p.left();
            p.down();
            p.down();
            p.down();

        }

        p.left();
        p.up();
        p.up();
        p.up();
        p.left();
        p.left();
        p.up();
        p.up();
        p.left();
        p.up();
        p.up();
        p.up();
    }
}
