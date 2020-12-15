package com.mingzhu.spring.mybatis;

import com.mingzhu.spring.DatabaseUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface UseDatabaseUserMapper {
    List<DatabaseUser> getUserByID(Integer id);
}
