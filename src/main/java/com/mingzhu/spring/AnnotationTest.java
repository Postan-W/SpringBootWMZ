package com.mingzhu.spring;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("anno")
public class AnnotationTest {

    public String name2;
    @Value("anno的第二个属性name2")
    public void setName2(String name2) {
        this.name2 = name2;
        Logger.getGlobal().info("看到这里说明Component还是使用了set给属性赋值");
    }

    public String name;
    @Value("ANNO")
    public void setName(String name) {
        this.name = name;
    }
}
