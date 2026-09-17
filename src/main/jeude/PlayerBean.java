package main.jeude;

public class PlayerBean {

    private String name;
    private int score = 0;
    private CupBean cup = new CupBean();
    private boolean cheater = false;


    public PlayerBean(String name) {
        this.name = name;
    }



    public void roll(){
        cup.roll();
    }

    public void add1Point(){
        score++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public CupBean getCup() {
        return cup;
    }

    public void setCup(CupBean cup) {
        this.cup = cup;
    }


    public boolean isCheater() {
        return cheater;
    }

    public void setCheater(boolean cheater) {
        this.cheater = cheater;
        cup = new CupBean(cheater);

    }
}
