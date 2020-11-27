package com.example.mingzhu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.*;
import java.util.logging.Logger;

@SpringBootApplication
public class MingzhuApplication {
    private static Logger log = Logger.getLogger(String.valueOf(MingzhuApplication.class));
    public static void main(String[] args) {
        //创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Box box = (Box)context.getBean("aliasForBox");
        Knife knife = (Knife)context.getBean("knife");
        out.println(String.format("length,width,height:%d,%d,%d",box.length,box.width,box.heigth));
        SpringApplication.run(MingzhuApplication.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        User2 user2 = ctx.getBean(User2.class);
        log.info(user.getId());
        log.info(user2.getId());
        out.println("服务正确启动");
    }
}
