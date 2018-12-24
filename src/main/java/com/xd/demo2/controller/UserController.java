package com.xd.demo2.controller;

import com.xd.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("user")
    public String getUserById(Integer id){
        return this.userService.getUserById(id).toString();
    }
}
