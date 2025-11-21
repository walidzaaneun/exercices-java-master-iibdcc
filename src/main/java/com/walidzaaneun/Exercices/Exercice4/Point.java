package com.walidzaaneun.Exercices.Exercice4;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (x < 0) {
            System.out.println("Erreur : x ne peut pas être négatif !");
        } else {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (y < 0) {
            System.out.println("Erreur : y ne peut pas être négatif !");
        } else {
            this.y = y;
        }
    }

    public void deplacer(int x, int y) {
        setX(this.x + x);
        setY(this.y + y);
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
