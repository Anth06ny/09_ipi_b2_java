package main;

public class ExoTab {

    public static void main(String[] args) {


        //exo1();

        int i =0;
        int[] t = new int[3];
        add1(i, t);
    }

    public static void add1(int value, int[] tab){
        value++;
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }

    public static void exo1(){
        int[] tab = new int[]{2, 5, 8, 12, 20};
        System.out.println("tab[4]=" + tab[4]);

        tab[2] = 12;
        System.out.println("Taille=" + tab.length);

        //indice + valeur
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + ":" + tab[i] + " ");
        }
        System.out.println();

        //incrémente de 1 chaque case
        for (int i = 0; i < tab.length; i++) {
           tab[i]++;
        }
        //valeur
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < tab.length; i++) {
            tab[i] = tab[i-1] + 1;
        }

//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(tab[i] + " ");
//        }

        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        System.out.println("sum=" + sum);
    }
}
