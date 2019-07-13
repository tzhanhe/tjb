package com.xztqd.tjb.service.impl;

import com.xztqd.tjb.mapper.UserMapper;
import com.xztqd.tjb.po.User;
import com.xztqd.tjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String userSelectPassword(String userid) {
        return userMapper.userSelectPassword(userid);
    }
}
