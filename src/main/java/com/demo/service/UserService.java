package com.demo.service;

import com.demo.mapper.UserMapper;
import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title:
 * @auther: raohr
 * @Date: 2021/2/24 14:05
 * @param:
 * @Description:
 * @return:
 * @throws:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectByPrimaryKey(String id){
        return userMapper.selectByPrimaryKey(id);
    }


    public User checkLogin(String username, String password) {
        return userMapper.checkLogin(username,password);
    }
}
