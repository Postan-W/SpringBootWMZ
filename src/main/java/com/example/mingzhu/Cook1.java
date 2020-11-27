package com.example.mingzhu;

public class Cook1 implements Cook{
    public Cooker cooker;
    Cook1(){
        System.out.println("spring默认调用Cook1无参构造");
    }
    public void setCooker(Cooker cooker){
        this.cooker = cooker;
    }
    @Override
    public String getTool() {
        return cooker.getTool();
    }
}
