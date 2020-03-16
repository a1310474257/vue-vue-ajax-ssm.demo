package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.IUserService;
import jdk.nashorn.internal.runtime.ECMAException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public List<User> findAll() throws Exception {
        List<User> all = userService.findAll();
        System.out.println(all);
        return all;
    };

    @RequestMapping("/findById.do")
    public User findById(Integer id) throws Exception{
        User byId = userService.findById(id);
        System.out.println(byId);
        return byId;
    }
    @RequestMapping("/updateUser.do")
    public void Update(@RequestBody User user) throws Exception{
        System.out.println(user);
        userService.Update(user);
    }

}
