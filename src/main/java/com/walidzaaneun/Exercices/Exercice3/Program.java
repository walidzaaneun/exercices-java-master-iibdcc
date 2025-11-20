package com.walidzaaneun.Exercices.Exercice3;


public class Program {
    public static void main(String[] args) {
        Salarie s = new Salarie();

        s.setMatricule(1234);
        s.setNom("Zaanoun");
        s.setAge(24);
        s.setSalaire(12000);

        System.out.println(s.getMatricule());
        System.out.println(s.getNom());
        System.out.println(s.getAge());
        System.out.println(s.getSalaire());

        System.out.println("----------------------------------");

        System.out.println(s);

        System.out.println("----------------------------------");

        s.setAge(66);
        s.setSalaire(0);

        System.out.println("----------------------------------");

        Salarie s2 = new Salarie(1235,"Alaoui",66,0);

        System.out.println(s2);


    }
}
