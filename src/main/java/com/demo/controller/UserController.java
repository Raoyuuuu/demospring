package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @auther: raohr
 * @Date: 2021/2/26 10:07
 * @param:
 * @Description:
 * @return:
 * @throws:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser")
    public String getUserName(String id){
        return "hello world";
    }
}
