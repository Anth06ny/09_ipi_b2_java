package main;

import main.beans.HouseBean;

public class ExoHouse {

    public static void main(String[] args) {
        //Exemple de test
        HouseBean myHouse = new HouseBean();
        myHouse.width = 12;
        myHouse.length = 25;
        printHouse(myHouse);
        doubleHouse(myHouse);
        printHouse(myHouse); //Normalement 24*50

        HouseBean myHouse2 = new HouseBean();
        myHouse2.width = 24;
        myHouse2.length = 50;
        HouseBean big = bigHouse(myHouse, myHouse2);
        System.out.print("Plus grande maison : ");

        printHouse(big);
    }

    //Affiche la largeur, longueur de la maison ou Null  : Exemple attendu :     12x25
    public static void printHouse(HouseBean m) {
        if(m == null) {
            System.out.println("null");
        }
        else {
            System.out.println(m.width + " " + m.length);
        }
    }

    //Double la taille de la maison. (N'affiche rien)
    public static void doubleHouse(HouseBean m) {
        if(m != null) {
            m.width = m.width * 2;
            m.length *= 2;
        }
    }

    //Retourne la maison la plus grande, et null si de la même taille. N'affiche rien
    public static HouseBean bigHouse(HouseBean m1, HouseBean m2) {
        if(m1 == null ) {
                return m2;
        }
        else if(m2 == null ) {
            return m1;
        }
        else if(m1.length * m1.width > m2.length * m2.width){
            return m1;
        }
        else if(m1.length * m1.width < m2.length * m2.width){
            return m2;
        }
        else {
            return null;
        }
    }


    public static void exo1() {
//        Créer une variable m de type HouseBean initialisée avec null
        HouseBean m = null;

//        Afficher m dans la console
        System.out.println(m);
//        Créer(new) une maison et la mettre dans m
        m = new HouseBean();

//        Afficher m dans la console
        System.out.println(m);
//        Définir la largeur de m à 5
        m.width = 5;
//        Afficher la largeur de m dans la console
        System.out.println(m.width);
//        Créer une variable m2 et lui assigner m
        HouseBean m2 = m;
//        Afficher m2 et la largeur de m2
        System.out.println(m2);
        System.out.println(m2.width);
//        Changer la largeur de m2 à 10
        m2.width = 10;
//        Afficher la largeur de m et de m2
        System.out.println(m.width + " " + m2.width);
    }
}
