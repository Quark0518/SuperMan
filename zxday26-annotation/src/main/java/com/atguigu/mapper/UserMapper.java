package com.atguigu.mapper;

import com.atguigu.pojo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @date 2022-08-03 16:44
 */
public interface UserMapper {
    List<User> selectAll() throws SQLException;
}