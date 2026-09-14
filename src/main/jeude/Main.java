package main.jeude;

public class Main {

    public static void main(String[] args) {

        PartyBean partyBean = new PartyBean("Toto", "Tata");

        for (int i = 0; i < 3; i++) {
            //J1 lance
            partyBean.getJ1().roll();
            //je teste s'il a fait 7
            if (partyBean.getJ1().getCup().getScoreDice() >= 7) {
                //je lui ajoute 1 point
                partyBean.getJ1().add1Point();
            }

            //J2 lance
            partyBean.getJ2().roll();
            //je teste s'il a fait 7
            if (partyBean.getJ2().getCup().getScoreDice() >= 7) {
                //je lui ajoute 1 point
                partyBean.getJ2().add1Point();
            }
        }

        //Affichage
        var gagnant = partyBean.winner();
        if (gagnant == null) {
            System.out.print("Egalité : ");
        } else {
            System.out.print(gagnant.getName() + " à gagné : ");
        }
        System.out.println(partyBean.getJ1().getScore() + " - " + partyBean.getJ2().getScore());


    }
}
