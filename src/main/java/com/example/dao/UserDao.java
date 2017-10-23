package com.example.dao;

import com.example.domain.User;
import com.sun.rowset.internal.Row;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public interface UserDao {
    public void add(final User user);

    public User get(String id);

    public List<User> getAll();

    public void deleteAll();

    public int getCount();

    public void update(User user1);

}
