package com.yaml;

import org.apache.catalina.LifecycleState;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;
/*告诉spring boot将本类中的所有属性和配置文件中的相关配置进行绑定*/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
