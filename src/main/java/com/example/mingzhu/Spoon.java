package com.example.mingzhu;

public class Spoon implements Cooker{
    public String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getTool() {
        return "it's spoon";
    }
}
