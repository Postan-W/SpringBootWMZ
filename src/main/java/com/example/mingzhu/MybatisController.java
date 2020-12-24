package com.example.mingzhu;

import com.mingzhu.spring.Clothes;
import com.mingzhu.spring.DatabaseUser;
import com.mingzhu.spring.mybatis.ClothesMapper;
import com.mingzhu.spring.mybatis.UseDatabaseUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MybatisController {
    @Autowired
    private UseDatabaseUserMapper useDatabaseUser;
    @Autowired
    private ClothesMapper clothesMapper;
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<DatabaseUser> getUserById(Integer id){
        return useDatabaseUser.getUserByID(id);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }

    @RequestMapping(value = "/clothes",method = RequestMethod.GET)
    public List<Clothes> getClothes(String name,String style){
        return clothesMapper.ByNameAndStyle(name,style);
    }

}
