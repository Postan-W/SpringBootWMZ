package com.mingzhu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//通过@Bean的方式将Bean注入到IoC容器中
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
    public User2 initUser2(){
        User2 user2 = new User2();
        user2.setId("2000");
        user2.setUserName("user2");
        user2.setNote("note2");
        return user2;
    }
}
