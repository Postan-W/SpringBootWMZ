package com.example.mingzhu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/main")
@ConfigurationProperties(prefix = "person2")
public class MicroserviceController {
    private String personName;
    private String personAge;
    private String personGender;

    @RequestMapping(value = "/argument", method = RequestMethod.GET)
    public String getArgument(String requestName) {
        return requestName;
    }
    //测试代码312412341234
    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public Map<String,String> getPerson(){
        Map<String,String> person = new HashMap<String,String>();
        person.put("name",personName);
        person.put("age",personAge);
        person.put("gender",personGender);
        return person;
    }
    @RequestMapping(value = "/personName",method = RequestMethod.GET)
    public String getPersonName(){
        return personName;
    }

    @RequestMapping(value = "/personAge",method = RequestMethod.GET)
    public String getPersonAge(){
        return personAge;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }
}
