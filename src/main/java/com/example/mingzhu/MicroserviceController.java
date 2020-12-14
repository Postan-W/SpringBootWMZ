package com.example.mingzhu;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("ttt")
public class MicroserviceController {

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public String getCreator(String requestName) {
        return requestName + "测试热部署"+"settings-compile-buildatomatically+ctrlshiftalt/";
    }
    @RequestMapping(value = "/second", method = RequestMethod.GET)
    //通过参数获取查询字符串
    public String getCreato(String requestName) {
        return requestName;
    }

}
