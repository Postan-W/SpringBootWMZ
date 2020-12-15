package com.example.mingzhu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
@ConfigurationProperties(prefix = "person2")
public class MicroserviceController {
    private String personName;
    private String personAge;
    @RequestMapping(value = "/argument", method = RequestMethod.GET)
    public String getArgument(String requestName) {
        return requestName;
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

}
