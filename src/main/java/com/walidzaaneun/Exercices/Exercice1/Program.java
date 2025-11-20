package com.walidzaaneun.Exercices.Exercice1;

public class Program {

    public static void main(String[] args) {
        Salarie s = new Salarie(1234,"Zaanoun","Walid",9000);
        Salarie s2 = new Salarie(2345,"Naji","Abdelwahab",12000.40);
        Salarie s3 = new Salarie(3456,"Youssfi","Moahmmed",11000.30);

        s.afficherInfos();
        s2.afficherInfos();
        s3.afficherInfos();

        s.augmenterSalaire(4);
        s2.augmenterSalaire(10);
        s3.augmenterSalaire(13);

        System.out.println("------------------------------------------------------------");

        SalarieManagement.afficherInfos(s);
        SalarieManagement.afficherInfos(s2);
        SalarieManagement.afficherInfos(s3);

        SalarieManagement.augmenterSalaire(s,2);
        SalarieManagement.augmenterSalaire(s2,2);
        SalarieManagement.augmenterSalaire(s3,2);

        System.out.println("------------------------------------------------------------");

        afficherDetail(s);
        afficherDetail(s2);
        afficherDetail(s3);

        System.out.println("------------------------------------------------------------");

        SalarieManagement.printNombreSalaries();


    }
    public static void afficherDetail(Salarie s){
        s.afficherInfos();
    }
}
