package com.atguigu.mapper.impl;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @date 2022-08-03 16:52
 */
@Repository
public class UserMapperImpl implements UserMapper {

    @Autowired
    private QueryRunner queryRunner;

    public List<User> selectAll() throws SQLException {
        return queryRunner.query("select * from b_student", new BeanListHandler<User>(User.class));

    }

    public User selectByPrimaryKey(Long id) throws SQLException {
        System.out.println("master第一次提交111111111111111111111");
    }
    public int updateByPrimaryKeySelective(User user) throws SQLException {
        System.out.println("dec-A第七次提交");
    }
}