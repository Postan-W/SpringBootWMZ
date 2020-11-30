package com.mingzhu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//通过@Bean的方式将Bean注入到IoC容器中
//代表这是一个配置类。这样就是通过纯Java方式配置bean
@Configuration
public class AppConfig {
    @Bean
    public User initUser(){
        User user = new User();
        user.setId("100000");
        user.setUserName("user1");
        user.setNote("note1");
        return user;
    }
    @Bean
    public AnnotationTest initAnnotationTest(){
        AnnotationTest annotationTest = new AnnotationTest();
        annotationTest.setName("第一个名字");
        annotationTest.setName2("第二个名字");
        return annotationTest;
    }
    @Bean
    public User2 initUser2(){
        User2 user2 = new User2();
        user2.setId("2000");
        user2.setUserName("user2");
        user2.setNote("note2");
        return user2;
    }
}
