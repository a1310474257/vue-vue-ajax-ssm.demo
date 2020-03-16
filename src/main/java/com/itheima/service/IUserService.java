package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface IUserService {
    public List<User> findAll() throws Exception;

    public User findById(Integer id) throws Exception;

    public void  Update(User user) throws Exception;
}
