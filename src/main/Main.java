package main;

import main.jeude.DiceBean;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int minuteToSecond(int minute) {
        return minute * 60;
    }

    public static int hourToMinute(int hour) {
        return hour * 60;
    }

    public static int hourAndMinuteToSecond(int hour, int minute) {
        //return  minuteToSecond(hourToMinute(hour)) + hourToMinute(minute);
        return hour * 3600 + minute * 60;
    }


    public static void main(String[] args) {
        //exo1();
//        crepe(10);
//        crepe(42);
        //crepeInteractive();
//        boulangerie(5, 6);
//        int resultat = minuteToSecond(5);
//        System.out.println(resultat);

        DiceBean dice = new DiceBean();
        for (int i = 0; i < 5; i++) {

            dice.roll();
            System.out.println(dice.getValue());
        }



    }

    public static void crepeInteractive() {
        //Demande un nombre dans la console à un utilisateur et le met dans nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre de crepe : ");
        int nombre = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        crepe(nombre);

    }

    public static void crepe(int nbCrepe) {
        System.out.println("Pour " + nbCrepe + " crêpes il faut :");
        System.out.println("-" + (nbCrepe * 20) + "g de farine");
        int nbOeufs = nbCrepe / 5;
        System.out.println("-" + nbOeufs + " oeuf(s)");
    }

    public static void boulangerie(int nbCroissant, int nbBaguette) {
        double total = nbCroissant * 1.1 + nbBaguette * 0.9;
        System.out.println("total=" + total);
    }

    public static void exo1() {
        int i = 7;
        int j = 3;

        int divEnt = i / j;
        System.out.println("divEnt=" + divEnt);

        int reste = i % j;
        System.out.println("reste=" + reste);

        double divClassique = i / (double) j;
        System.out.println("divClassique=" + divClassique);

        double somme = divEnt + divClassique + reste;
        System.out.println("somme=" + somme);

        System.out.println("somme=" + String.format("%.2f", somme));
        System.out.printf("somme=%.2f", somme);
    }
}