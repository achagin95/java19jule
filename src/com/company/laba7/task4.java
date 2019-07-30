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
        p.endLine();
    }
}
