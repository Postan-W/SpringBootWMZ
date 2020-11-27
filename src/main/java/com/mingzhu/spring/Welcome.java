package com.mingzhu.spring;
import static java.lang.System.*;
public class Welcome {
    private String name;

    public String getName() {
        return name;
    }
    //依赖注入 : 就是利用set方法来进行注入的.
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        out.println("Welcome" + name);
    }
}
