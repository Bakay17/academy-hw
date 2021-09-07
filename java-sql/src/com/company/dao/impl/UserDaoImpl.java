package com.company.dao.impl;

import com.company.dao.Connect;
import com.company.dao.UserDao;
import com.company.model.User;

import java.sql.*;
import java.util.Date;

public class UserDaoImpl extends Connect implements UserDao {
    @Override
    public User createUser(User user) {
        String sql = "insert into user_jv(login, email, password, date_of_reg)" +
                "values(?, ?, ?, ?)";
        Connection connection = null;
        ResultSet set = null;
        PreparedStatement statement = null;
        try {
            Date date = new Date();
            user.setDateOfReg(new Timestamp(date.getTime()));
            connection = connect();
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setTimestamp(4, user.getDateOfReg());
            statement.executeUpdate();
            set = statement.getGeneratedKeys();
            if (set.next()){
                user.setId(set.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null)
                    set.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public User checkUser(String login) {
        String sql = "select id, login, e,ail, password, date_of_reg " +
                "from user_jv where + ?";
        ResultSet set = null;
        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, login);
            assert false;
            if (set.next()){
                User user = new User();
                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setLogin(set.getString("login"));
                user.setPassword(set.getString("password"));
                user.setDateOfReg(set.getTimestamp("date_of_reg"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null)
                    set.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int countFalseLogin(int id) {
        int counter = 0;
        String sql = "select is_flag from user_log\n " +
                "where is_flag = false and user_id = ?;";

        ResultSet set = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            set = statement.executeQuery();
            while (set.next()){
                counter++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null) {
                    set.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return counter;
    }

    @Override
    public void deleteLogin(int id) {
        String sql = "delete from user_jv\n" +
                "where is_flag = false and user_id = ?";
        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
