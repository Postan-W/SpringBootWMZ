package com.example.mingzhu;

import com.yaml.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("ttt")
@ConfigurationProperties(prefix = "person")
public class MicroserviceController {
    private String personName;
    private String personAge;
    @RequestMapping(value = "/argument", method = RequestMethod.GET)
    public String getArgument(String requestName) {
        return requestName;
    }
//    @RequestMapping(value = "/configfilename", method = RequestMethod.GET)
//    public String getConfigfilename() {
//        return name;
//    }
    @RequestMapping(value = "/personName",method = RequestMethod.GET)
    public String getPersonName(){
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }

    @RequestMapping(value = "/personAge",method = RequestMethod.GET)
    public String getPersonAge(){
        return personAge;
    }

}
