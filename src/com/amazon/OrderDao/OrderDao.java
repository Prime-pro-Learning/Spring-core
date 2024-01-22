package com.amazon.OrderDao;

import com.amazon.Order;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDao {
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public String saveOrder(Order order1){
        int update = jdbcTemplate.update("insert into Amazon_Order values(?,?,?,?)", order1.getId(), order1.getDescription(),
                order1.getQuantity(), order1.getNameOfTheOrder());
        return update>0?"Successfully Inserted into DB.":"";
    }

    }

