package com.itheima.service.impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> findAll() throws Exception {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) throws Exception {
        return userDao.findById(id);
    }

    @Override
    public void Update(User user) throws Exception {
        userDao.Update(user);
    }
}
