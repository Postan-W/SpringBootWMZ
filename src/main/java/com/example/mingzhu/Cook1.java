package com.example.mingzhu;

public class Cook1 implements Cook{
    public Cooker cooker;
    public void setCooker(Cooker cooker){
        this.cooker = cooker;
    }
    @Override
    public String getTool() {
        return cooker.getTool();
    }
}
