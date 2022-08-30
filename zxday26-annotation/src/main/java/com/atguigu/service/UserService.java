package com.atguigu.service;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @date 2022-08-03 16:44
 */

public interface UserService {
    List<User> selectAll() throws SQLException;
}