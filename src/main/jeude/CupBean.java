package main.jeude;

public class CupBean {

    private DiceBean d1, d2;

    public CupBean() {
        this(false) ;
    }

    public CupBean(boolean cheater) {
        if (cheater) {
            d1 = new LoadedDiceBean(6);
        } else {
            d1 = new DiceBean();
        }
        d2 = new DiceBean();
    }


    public void roll() {
        d1.roll();
        d2.roll();
    }

    public int getScoreDice() {
        return d1.getValue() + d2.getValue();
    }

    public DiceBean getD1() {
        return d1;
    }

    public void setD1(DiceBean d1) {
        this.d1 = d1;
    }

    public DiceBean getD2() {
        return d2;
    }

    public void setD2(DiceBean d2) {
        this.d2 = d2;
    }
}
