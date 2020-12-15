package com.mingzhu.spring.mybatis;

import com.mingzhu.spring.Clothes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClothesMapper {
    @Select("select * from clothes where name = #{name}")
    public List<Clothes> ByName(String name);

    @Select("select * from clothes where name = #{name} and style = #{style}")
    public List<Clothes> ByNameAndStyle(@Param("name")String name,@Param("style")String style);
}
