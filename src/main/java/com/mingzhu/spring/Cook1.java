package com.mingzhu.spring;

import java.util.logging.Logger;

public class Cook1 implements Cook{
    public Cooker cooker;
    Cook1(){
        Logger.getGlobal().info("spring默认调用Cook1无参构造");
    }
    public void setCooker(Cooker cooker){
        this.cooker = cooker;
        Logger.getGlobal().info("看到这个说明spring调用了cook1的set方法");
    }
    @Override
    public String getTool() {
        return cooker.getTool();
    }
}
