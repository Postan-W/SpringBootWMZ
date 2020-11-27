package com.mingzhu.spring;

import java.util.logging.Logger;

public class Box {
    public int length;
    public int width;
    public int heigth;
    public Spoon spoon;
    public void setLength(int length) {
        this.length = length;
        Logger.getGlobal().info("有参构造情况下不会调用Box的set函数为属性赋值，所以看不到这个输出");
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

    Box(int length, int width, int heigth,Spoon spoon){
        this.length =length;
        this.width = width;
        this.heigth = heigth;
        this.spoon = spoon;
        Logger.getGlobal().info("看到这个输出说明spring利用了Box的有参构造函数");
    }
}
