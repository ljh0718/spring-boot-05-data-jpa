package com.atguigu.springboot.controller;

import com.atguigu.springboot.entity.User;
import com.atguigu.springboot.repostitory.UserRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.Z
 * @create 2019/8/6 9:02
 */
@RestController
public class UserController {

    @Autowired
    UserRepostitory userRepostitory;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepostitory.findById(id).get();
        return user;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        userRepostitory.save(user);
        return user;
    }
}
