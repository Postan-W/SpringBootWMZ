package com.example.mingzhu;

public class Box {
    public int length;
    public int width;
    public int heigth;

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getLength() {
        return length;
    }

    Box(int length, int width, int heigth){
        this.length =length;
        this.width = width;
        this.heigth = heigth;
    }
}
