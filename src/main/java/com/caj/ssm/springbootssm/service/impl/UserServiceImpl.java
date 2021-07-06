package com.caj.ssm.springbootssm.service.impl;

import com.caj.ssm.springbootssm.mapper.UserMapper;
import com.caj.ssm.springbootssm.model.User;
import com.caj.ssm.springbootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user)
    {
        this.userMapper.addUser(user);
    }
}
