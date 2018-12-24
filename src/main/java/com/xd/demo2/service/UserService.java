package com.xd.demo2.service;

import com.xd.demo2.mapper.UserMapper;
import com.xd.demo2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id){
        return this.userMapper.selectByPrimaryKey(id);
    }

}
