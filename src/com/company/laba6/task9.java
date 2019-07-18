package com.company.laba6;

public class task9 {
    public static void main(String[] args) {
        Pen p = Pen.prepare();
        p.down();
        p.down();
        p.down();
        p.right();
        p.startLine();
        for (int i = 0; i <= 2; i++) {
            p.right();

        }
        p.up();

        p.right();
        p.right();
        p.up();
        p.right();
        for (int i = 0; i <= 5; i++) {
            p.down();
        }
        for (int i = 0; i <= 7; i++) {
            p.right();
        }
        for (int i = 0; i <= 5; i++) {
            p.right();
        }
        p.up();
        p.up();
        p.right();
        p.down();
        p.down();
        p.down();
        p.left();
        for (int i = 0; i <= 7; i++) {
            p.down();
        }
        p.left();
        p.left();
        p.up();
        p.right();
        p.up();
        p.up();
        p.up();
        for (int i = 0; i <= 13; i++) {
            p.left();
        }
        p.down();
        p.down();
        p.down();
        p.down();
        p.left();
        p.left();
        p.up();
        p.right();
        p.up();
        p.up();
        p.up();
        p.left();
        for (int i = 0; i <= 5; i++) {
            p.up();
        }
        p.left();
        p.left();
        p.left();
        p.up();
        p.up();
        p.up();
        p.endLine();

    }
}
