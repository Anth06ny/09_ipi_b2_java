package main.jeude;

public class PartyBean {
    private PlayerBean j1, j2, currentPLayer;
    private int round = 1;

    public PartyBean(String namej1, String namej2) {
        j1 = new PlayerBean(namej1);
        j2 = new PlayerBean(namej2);
        currentPLayer = j1;
    }

    public PlayerBean winner(){
        if(j1.getScore() > j2.getScore()) {
            return j1;
        }
        else if(j2.getScore() > j1.getScore()) {
            return j2;
        }
        else {
            return null;
        }
    }



    public PlayerBean getJ1() {
        return j1;
    }

    public void setJ1(PlayerBean j1) {
        this.j1 = j1;
    }

    public PlayerBean getJ2() {
        return j2;
    }

    public void setJ2(PlayerBean j2) {
        this.j2 = j2;
    }

    public PlayerBean getCurrentPLayer() {
        return currentPLayer;
    }

    public void setCurrentPLayer(PlayerBean currentPLayer) {
        this.currentPLayer = currentPLayer;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}
