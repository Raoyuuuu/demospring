package com.demo.controller;

import com.demo.model.User;
import com.demo.service.UserService;
import com.sun.tools.internal.ws.processor.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @auther: raohr
 * @Date: 2021/2/26 13:42
 * @param:
 * @Description:
 * @return:
 * @throws:
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("checkLogin")
    public String login(String username,String password){
        User user = userService.checkLogin(username,password);
        if (user!=null){
            return "success";
        }
        return "fail";
    }
}
