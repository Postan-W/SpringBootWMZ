package com.example.mingzhu;

import com.yaml.Person;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class MingzhuApplicationTests {
    @Autowired
    public Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
