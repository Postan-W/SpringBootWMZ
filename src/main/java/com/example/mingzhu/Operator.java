package com.example.mingzhu;

public class Operator {
    private Hammer hammer;
    private Axe axe;
    private String date;

    public void setDate(String date) {
        this.date = date;
    }

    public void setHammer(Hammer hammer) {
        this.hammer = hammer;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public Axe getAxe() {
        return this.axe;
    }

    public Hammer getHammer() {
        return hammer;
    }
}
