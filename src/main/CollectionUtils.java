package main;

import main.beans.StudentBean;

import java.util.ArrayList;
import java.util.Random;

public class CollectionUtils {

    public static void main(String[] args) {
        ArrayList<StudentBean> myList = new ArrayList<>();
        addOne(myList);
        System.out.print("Taille de la liste : " + myList.size()); //Normalement 1
        fillList(myList, 5);
        fillList(null, 5);
        printList(myList);

        StudentBean max = getMax(myList);
        System.out.print("Max :");
        //ExoStudent.printStudent(max);
    }

    //Retourne un prénom aléatoire (Rien à faire)
    public static String getRandomName() {
        String[] name = new String[]{"Toto", "Tata", "Titi", "Bob", "Alfred"};
        return name[new Random().nextInt(name.length)];
    }

    //Créer un élève avec un nom(getRandomName()) et une note aléatoire et l'ajoute à la liste en paramètre
    public static void addOne(ArrayList<StudentBean> list) {
        var student = new StudentBean(getRandomName(), new Random().nextInt(21));
        list.add(student);
    }

    //Remplis la liste d’élève leur donnant des noms et note aléatoire
    public static void fillList(ArrayList<StudentBean> list, int nbStudent) {
        for (int i = 0; i < nbStudent; i++) {
            addOne(list);
        }
    }

    //Affiche la liste dans la console.
//Vous pouvez essayer d'utiliser la surcharge de toString de StudentBean
    public static void printList(ArrayList<StudentBean> list) {
        for (StudentBean studentBean : list) {
            System.out.println(studentBean);
        }
    }

    //Retourne le 1er élève avec la meilleur note
    public static StudentBean getMax(ArrayList<StudentBean> list) {
        StudentBean max = null;
        for (StudentBean studentBean : list) {
            if (max == null || studentBean.getNote() < max.getNote()) {
                max = studentBean;
            }
        }

        return max;
    }
}
