package com.walidzaaneun.Exercices.Exercice2;

class Point {
    private int x;
    private int y;

    Point() {
        this.x = -1;
        this.y = -1;
    }

    void deplacer(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return  x + " " + y;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Point p = new Point();
        p.deplacer(3, 4);
        System.out.println(p);
    }
}