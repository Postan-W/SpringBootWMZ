package com.example.mingzhu;

import com.mingzhu.spring.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static java.lang.System.*;
import java.util.logging.Logger;

@SpringBootApplication
public class MingzhuApplication {
    private static Logger log = Logger.getLogger(String.valueOf(MingzhuApplication.class));
    public static void main(String[] args) {
        //创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Box box = (Box)context.getBean("aliasForBox");
        ApplicationContext context2 = new FileSystemXmlApplicationContext("classpath:beans.xml");
        AnnotationTest annotationTest = (AnnotationTest) context2.getBean("anno");
        Logger.getGlobal().info(annotationTest.name);
        Logger.getGlobal().info(annotationTest.name2);
        Logger.getGlobal().info(box.spoon.getTool());
        //singleton模式下bean在容器创建的时候就被创建，并且始终只有一个
        Knife knife = (Knife)context.getBean("knife");
        Knife knife2 = (Knife)context.getBean("knife");
        out.print("获取的两个Knife引用指向同一个对象吗？");
        out.println(knife == knife2);
        Operator operator = (Operator)context.getBean("operator");
        Logger.getGlobal().info(operator.getAxe().getToolName());
        Logger.getGlobal().info(operator.getHammer().getToolName());
        operator.setDate("Friday");
        Logger.getGlobal().info(operator.getDate());
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












