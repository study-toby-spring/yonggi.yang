package com.example;

import com.example.dao.*;
import com.example.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);


        User user = dao.get("1");
        user = dao.get("1");
        user = dao.get("1");
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getId() + "조회 성공");

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);

        System.out.println("Connection counter : " + ccm.getCounter());


    }
}
