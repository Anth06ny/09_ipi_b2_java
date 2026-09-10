package main;

import main.beans.HouseBean;

public class ExoHouse {

    public static void main(String[] args) {
        exo1();
    }

    public static void exo1(){
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
        System.out.println(m.width + " "+ m2.width);
    }
}
