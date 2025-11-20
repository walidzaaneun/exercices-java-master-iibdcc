package com.walidzaaneun.Exercices.Exercice1;

public class Salarie {
    private int matricule;
    private String nom;
    private String prenom;
    private double salaire;
    private static int nombreSalaries = 0;

    public void afficherInfos() {
        System.out.println( "Salarie{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}');
    }

    public void augmenterSalaire(double taux){
        this.salaire += this.salaire * (taux * 0.01);
    }

    public static void printNombreSalaries(){
        System.out.println("Nombre salaries: " + nombreSalaries);
    }

    public static void afficherDetail(Salarie s){
        s.afficherInfos();
    }

    public Salarie(int matricule, String nom, String prenom, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        nombreSalaries++;
    }
}
