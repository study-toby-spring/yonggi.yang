package com.example;

import com.example.dao.ConnectionMaker;
import com.example.dao.DConnectionMaker;
import com.example.dao.DaoFactory;
import com.example.dao.UserDao;
import com.example.domain.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao dao = new DaoFactory().userDao();
        User user = dao.get("1");
        System.out.println(user.getName());
        System.out.println(user.getPassword());

        System.out.println(user.getId() + "조회 성공");

    }
}
