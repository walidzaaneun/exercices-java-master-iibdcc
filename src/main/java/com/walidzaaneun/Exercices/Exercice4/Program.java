package com.walidzaaneun.Exercices.Exercice4;

import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();

        points.add(new Point(3, 4));
        points.add(new Point(1, 1));
        points.add(new Point(5, 2));
        points.add(new Point(0, 7));

        System.out.println("Liste des points :");
        for (Point p : points) {
            System.out.println(p);
        }

        System.out.println("------------------------------");

        pointLePlusProche(points);

    }

    public static void pointLePlusProche(ArrayList<Point> liste) {

        if (liste.isEmpty()){
            System.out.println("la liste des points est vide");
            return;
        }

        Point minPoint = liste.get(0);

        for (Point p : liste) {
            double minCarre = Math.sqrt(minPoint.getX() * minPoint.getX() + minPoint.getY() * minPoint.getY());
            double pCarre = Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());

            if (pCarre < minCarre) {
                minPoint = p;
            }
        }

        System.out.println("Le point le plus proche de l'origine est : " + minPoint);
    }
}
