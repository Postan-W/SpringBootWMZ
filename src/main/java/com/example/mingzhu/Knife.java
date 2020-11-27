package com.example.mingzhu;

public class Knife implements Cooker{
    public  String name;

    public Knife() {
        System.out.println("看到这个说明spring使用了knife的无参构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getTool() {
        return "it's knife";
    }
}

