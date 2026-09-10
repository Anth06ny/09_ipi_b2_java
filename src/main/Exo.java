package main;

public class Exo {
    public static void main(String[] args) {
        System.out.println(charAt3("Sa"));
        System.out.println("fin");
    }

    public static char charAt3(String chaine){
        if(chaine.length() < 3)
            return chaine.charAt(2);
        else return '?';
    }

    public static int max(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }
        else if(b>c && b > a) {
            return b;
        }
        else {
            return c;
        }

    }
}
