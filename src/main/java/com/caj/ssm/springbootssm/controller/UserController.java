package com.caj.ssm.springbootssm.controller;

import com.caj.ssm.springbootssm.model.User;
import com.caj.ssm.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public String addUser()
    {
        User user = new User();
        user.setUserName("zhangsan");
        user.setAge(23);
        this.userService.addUser(user);
        return "添加成功！";
    }
}
