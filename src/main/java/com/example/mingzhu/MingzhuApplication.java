package com.example.mingzhu;

import ch.qos.logback.core.db.dialect.MySQLDialect;
import com.mingzhu.spring.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static java.lang.System.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@SpringBootApplication
@MapperScan("com.mingzhu.spring")//如果不加则默认在当前包内找mapper
public class MingzhuApplication {
    private static Logger log = Logger.getLogger(String.valueOf(MingzhuApplication.class));
    public static void main(String[] args) throws IOException {


        SocketToPython socketToPython = new SocketToPython();
        socketToPython.remoteCall();
        //这里去找xml配置的bean
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //这里找到纯Java配置类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Clothes clothes = ctx.getBean(Clothes.class);
        Logger.getGlobal().info(String.format("名称：%s//n 款式:%s//n颜色：%s//n,尺寸:%s",clothes.name,clothes.style,clothes.color,
                clothes.size));
       //this.mybatis.insertIntoClothes();
        Box box = (Box)context.getBean("aliasForBox");
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
        User user = ctx.getBean(User.class);
        User2 user2 = ctx.getBean(User2.class);
        AnnotationTest annotationTest1 = ctx.getBean(AnnotationTest.class);
        Logger.getGlobal().info(annotationTest1.getName2());
        Logger.getGlobal().info(annotationTest1.getName());
        out.println("服务正确启动");
    }
}












