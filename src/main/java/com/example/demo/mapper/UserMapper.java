package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
public interface UserMapper {

     String getUserName(@Param("id")int id);

     @Select("select username,password from User")
     @Results({
             @Result(property = "username",column = "userName"),
             @Result(property = "password",column = "passWord"),
     })
     List<User> getAll();
/*
@Results各个属性的含义，id为当前结果集声明唯一标识，value值为结果集映射关系，
@Result代表一个字段的映射关系，
column指定数据库字段的名称，
property指定实体类属性的名称，
jdbcType数据库字段类型，
@Result里的id值为true表明主键，默认false；
使用@ResultMap来引用映射结果集，其中value可省略
*/
}
