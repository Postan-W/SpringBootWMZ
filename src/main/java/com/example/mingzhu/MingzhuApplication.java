package com.example.mingzhu;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class MingzhuApplication {
    private static Logger log = Logger.getLogger(String.valueOf(MingzhuApplication.class));
    public static void main(String[] args) {
        SpringApplication.run(MingzhuApplication.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        User2 user2 = ctx.getBean(User2.class);
        log.info(user.getId());
        log.info(user2.getId());
    }

}
