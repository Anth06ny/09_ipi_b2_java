package main.dictee;

public class Dictee {

    public static void main(String[] args) {
        m2();
        double v = m3(12, 8.5);
        m1((int)v);
    }

    public static void m1(int p1){
        System.out.println("p1=" + p1);
    }
    public static void m2(){
        long v1 = 3;
        System.out.println("v1=" + v1);
    }
    public static double m3(double p1, double p2){
        return p1 + p2;
    }
}
