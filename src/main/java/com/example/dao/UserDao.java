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

public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet rs, int i) throws SQLException {
            User user = new User();
            user.setId(rs.getString("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            return user;
        }
    };

    public void add(final User user) {
        this.jdbcTemplate.update("insert into users(id,name,password) values(?,?,?)",
                user.getId(), user.getName(), user.getPassword());
    }

    public User get(String id) {
        return this.jdbcTemplate.queryForObject("select * from users where id = ?", new Object[]{id}, userRowMapper);
    }

    public List<User> getAll() {
        return this.jdbcTemplate.query("select * from users order by id", userRowMapper);
    }

    public void deleteAll() {
        this.jdbcTemplate.update("delete from users");
    }

    public int getCount() {
        Integer value = this.jdbcTemplate.queryForObject("select count(*) from users", Integer.class);
        return (value == null) ? 0 : value.intValue();
    }


}
