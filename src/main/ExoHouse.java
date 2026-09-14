package main;

import main.beans.HouseBean;

import java.util.Random;

public class ExoHouse {

    public static void main(String[] args) {
//        //Exemple de test
//        HouseBean myHouse = new HouseBean();
//        myHouse.width = 12;
//        myHouse.length = 25;
//        printHouse(myHouse);
//        doubleHouse(myHouse);
//        printHouse(myHouse); //Normalement 24*50
//
//        HouseBean myHouse2 = new HouseBean();
//        myHouse2.width = 24;
//        myHouse2.length = 50;
//        HouseBean big = bigHouse(myHouse, myHouse2);
//        System.out.print("Plus grande maison : ");
//
//        printHouse(big);
        testTab();
    }

    public static void testTab() {
//        Créer un tableau de maison de taille 5
        HouseBean[] hb = new HouseBean[5];

//        Afficher dans la console la 3ᵉ case du tableau
        System.out.println(hb[3]);

//        Que peut-on en conclure ?
//        Créer une maison m1 de largeur 10
        HouseBean m1 = new HouseBean();

//        Mettre m1 dans la case 0, 1 et 2 du tableau
        hb[0] = m1;
        hb[1] = m1;
        hb[2] = m1;

//        Afficher la largeur des 3 premières cases du tableau
        System.out.println(hb[0].getWidth());
        System.out.println(hb[1].getWidth());
        System.out.println(hb[2].getWidth());

//        Mettre la largeur de la 1re case à 20
        hb[0].setWidth(20);

//        Afficher la largeur des 3 premières cases du tableau
        //        Afficher la largeur des 3 premières cases du tableau
        System.out.println(hb[0].getWidth());
        System.out.println(hb[1].getWidth());
        System.out.println(hb[2].getWidth());


//        Que peut-on en conclure ?
//        Que va-t-il se passer si on affiche la largeur de la 4ᵉ case du tableau ?
//        Afficher la largeur des 3 premières cases du tableau

    }

    /* -------------------------------- */
    // Collections
    /* -------------------------------- */
    //Créer une maison dans chaque case du tableau avec des largeurs et longueurs aléatoires
    public static void createHouses(HouseBean[] tab) {
        if (tab != null) {
            Random rand = new Random();

            for (int i = 0; i < tab.length; i++) {
                tab[i] = new HouseBean();
                tab[i].setWidth(rand.nextInt(100));
                tab[i].setLength(rand.nextInt(100));
            }
        }
    }

    //Affiche les maisons du tableau avec leur taille. 1 maison par ligne ex : 18x24
    public static void printHouses(HouseBean[] tab) {
        if (tab != null) {
            for (HouseBean houseBean : tab) {
                printHouse(houseBean);
            }
        }
    }

    //Retourne la maison la plus grande (Longueur * largeur). La 1ere en cas d'égalité
    public static HouseBean bigHouses(HouseBean[] tab) {

        HouseBean max = null;
        if (tab != null) {
            for (HouseBean houseBean : tab) {
                max = bigHouse(max, houseBean);
            }
        }

        return max;
    }

    /* -------------------------------- */
    // Unitaire
    /* -------------------------------- */

    //Affiche la largeur, longueur de la maison ou Null  : Exemple attendu :     12x25
    public static void printHouse(HouseBean m) {
        if (m == null) {
            System.out.println("null");
        } else {
            System.out.println(m.getWidth() + " " + m.getLength());
        }
    }

    //Double la taille de la maison. (N'affiche rien)
    public static void doubleHouse(HouseBean m) {
        if (m != null) {
            m.setWidth(m.getWidth() * 2);
            m.setLength(m.getLength() * 2);
        }
    }

    //Retourne la maison la plus grande, et null si de la même taille. N'affiche rien
    public static HouseBean bigHouse(HouseBean m1, HouseBean m2) {
        if (m1 == null) {
            return m2;
        } else if (m2 == null) {
            return m1;
        } else if (m1.getArea() > m2.getArea()) {
            return m1;
        } else if (m1.getArea() < m2.getArea()) {
            return m2;
        } else {
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
        m.setWidth(5);
//        Afficher la largeur de m dans la console
        System.out.println(m.getWidth());
//        Créer une variable m2 et lui assigner m
        HouseBean m2 = m;
//        Afficher m2 et la largeur de m2
        System.out.println(m2);
        System.out.println(m2.getWidth());
//        Changer la largeur de m2 à 10
        m2.setWidth(10);
//        Afficher la largeur de m et de m2
        System.out.println(m.getWidth() + " " + m2.getWidth());
    }
}
