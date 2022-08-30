package com.atguigu.service.impl;

import com.atguigu.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class UserSeviceImplTest {
    ClassPathXmlApplicationContext classPathXml = null;

    @Before
    public void init(){
        classPathXml = new ClassPathXmlApplicationContext("spring.xml");

    }


    @Test
    public void selectAll() throws SQLException {
        UserSeviceImpl userSevice = classPathXml.getBean(UserSeviceImpl.class);
        List<User> users = userSevice.selectAll();
        System.out.println("users = " + users);
    }
}