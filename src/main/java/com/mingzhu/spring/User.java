package com.mingzhu.spring;

import lombok.Data;
import lombok.Value;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
/*
* @Component是标明哪个类被扫描进入Spring IoC容器，而@ComponentScan则是标明采用何种策略去扫描装配Bean
* */
@Data
public class User {
    private String id;
    private String userName;
    private String note;
}
