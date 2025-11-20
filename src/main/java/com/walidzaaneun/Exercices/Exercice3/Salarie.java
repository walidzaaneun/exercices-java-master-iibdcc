package com.walidzaaneun.Exercices.Exercice3;

public class Salarie {
    private int matricule;
    private String nom;
    private int age;
    private double salaire;

    public Salarie() {}

    public Salarie(int matricule, String nom, int age, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        setAge(age);
        setSalaire(salaire);
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) {
            System.out.println("Erreur : L'âge doit être entre 18 et 65 ans !");
        } else {
            this.age = age;
        }
    }

    public double getSalaire() {
        return salaire;
    }


    public void setSalaire(double salaire) {
        if (salaire <= 0) {
            System.out.println("Erreur : Le salaire doit être supérieur à 0 !");
        } else {
            this.salaire = salaire;
        }
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", salaire=" + salaire +
                '}';
    }
}
