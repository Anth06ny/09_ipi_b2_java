package main.beans;

public class SubmarineBean {

    //    Créer une classe représentant un sous-marin qui aura un nom et une profondeur en mètre
    private String name;
    private int depth;

//La profondeur pourra être récupérée à l'extérieur de la classe, mais ne pourra pas être modifiée

    public static void main(String[] args) {
        SubmarineBean squall = new SubmarineBean();

        squall.setName("Squall");
        squall.dive();
        squall.dive();
        squall.rise();
        squall.rise();
        squall.rise();

        System.out.println(squall.getName() + " " +  squall.getDepth());

    }

    public int getDepth() {
        return depth;
    }

    //On ajoutera une méthode pour plonger qui fera descendre le sous-marin de 50 mètres
    public void dive() {
        depth += 50;
    }

    public void rise() {
        depth -= 50;
        if (depth < 0) {
            depth = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
