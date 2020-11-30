package com.mingzhu.spring;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface Mybatis {
    List<Clothes> getClothesByName(String name);
    void insertIntoClothes(Clothes clothes);
}
