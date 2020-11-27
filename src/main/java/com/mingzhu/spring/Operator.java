package com.mingzhu.spring;

import com.mingzhu.spring.Axe;
import com.mingzhu.spring.Hammer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Operator {
    @Autowired
    private Hammer hammer;
    @Autowired
    @Qualifier(value = "axe2")
    private Axe axe;
    private String date;

    public void setDate(String date) {
       this.date = date;
   }

//    public void setHammer(Hammer hammer) {
//        this.hammer = hammer;
//    }

//    public void setAxe(Axe axe) {
//        this.axe = axe;
//    }

    public String getDate() {
        return date;
    }

    public Axe getAxe() {
        return this.axe;
    }

    public Hammer getHammer() {
        return hammer;
    }
}
