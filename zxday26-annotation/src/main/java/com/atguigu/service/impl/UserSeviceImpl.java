package com.atguigu.service.impl;

import com.atguigu.mapper.impl.UserMapperImpl;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @date 2022-08-03 18:32
 */

@Service
public class UserSeviceImpl implements UserService {
    //使用UserMapper对象
    @Autowired
    private UserMapperImpl userMapper;

    public List<User> selectAll() throws SQLException {
        return userMapper.selectAll();
    }
}