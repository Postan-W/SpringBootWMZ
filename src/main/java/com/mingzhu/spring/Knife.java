package com.mingzhu.spring;

import java.util.logging.Logger;

public class Knife implements Cooker{
    public  String name;

    public Knife() {
        Logger.getGlobal().info("看到这个说明spring使用了knife的无参构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        Logger.getGlobal().info("无参构造后spring调用了Knife的set方法为属性赋值");
    }

    @Override
    public String getTool() {
        return "it's knife";
    }
}

