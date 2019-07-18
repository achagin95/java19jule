package com.company.laba6;



public class task8 {
    public static void main(String[] args) {

        Pen p = Pen.prepare();
        p.down();
        p.right();
        p.startLine();

        for (int i=0; i<=5; i++) {
            p.right();

        }
        for (int i=0; i<=5; i++) {
            p.down();
        }
        for (int i=0; i<=5; i++) {
            p.left();
        }
        for (int i=0; i<=5; i++) {
            p.up();
        }
        p.endLine();

    }
}
