package com.yaml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class UsePerson {
    @Autowired
    Person person;
    @Value("${person.name}")
    String description;
    public void OutputPerson(){
        System.out.println(this.person);
    }

    public void OutputDespriction(){
        System.out.println(this.description);
    }
}
