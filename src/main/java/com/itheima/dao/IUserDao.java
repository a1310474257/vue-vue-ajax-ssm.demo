package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    public List<User> findAll() throws Exception;

    @Update("update user set username=#{username},password=#{password},sex=#{sex},age=#{age},email=#{email} where id=#{id}")
    void Update(User user) throws Exception;

    @Select("select * from user where id=#{id}")
    User findById(Integer id) throws Exception;
}
