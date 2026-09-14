package main.jeude;

import java.util.Random;

public class DiceBean {

    private int value;


    public void roll(){
        value =  new Random().nextInt(6) + 1;
    }

    /* -------------------------------- */
    // GET / SET
    /* -------------------------------- */


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
