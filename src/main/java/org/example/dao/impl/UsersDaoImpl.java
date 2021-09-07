package org.example.dao.impl;

import org.example.dao.Connect;
import org.example.dao.UsersDao;
import org.example.model.User;
import org.example.model.UserLog;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersDaoImpl extends Connect implements UsersDao {
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
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setTimestamp(4, user.getDateOfReg());

            statement.executeUpdate();
            set = statement.getGeneratedKeys();
            if (set.next()) {
                user.setId(set.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                assert set != null;
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public UserLog createUserLog(UserLog userLog) {
        String sql = "insert into user_log(is_good, user_id, time_log) +\n" +
                "values(?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet set = null;
        try {
            Date date = new Date();
            userLog.setTimeLogs(new Timestamp(date.getTime()));
            connection = connect();
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setBoolean(1, userLog.getGood());
            statement.setInt(2, userLog.getUserId());
            statement.setTimestamp(3, userLog.getTimeLogs());

            statement.executeUpdate();
            set = statement.getGeneratedKeys();

            if (set.next()) {
                userLog.setId(set.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert connection != null;
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                assert set != null;
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public User checkUserLogin(String userLogin) {
        String sql = "select * from user_jv where login = ?";

        ResultSet set = null;
        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, userLogin);
            set = statement.executeQuery();

            if (set.next()) {
                User user1 = new User();
                user1.setId(set.getInt("id"));
                user1.setLogin(set.getString("login"));
                user1.setEmail(set.getString("email"));
                user1.setPassword(set.getString("password"));
                user1.setDateOfReg(set.getTimestamp("date_of_reg"));
                return user1;
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null) set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public User checkUserEmail(String userEmail) {
        String sql = "select * from user_jv where email = ?";
        ResultSet set = null;
        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, userEmail);
            set = statement.executeQuery();

            if (set.next()) {
                User user1 = new User();
                user1.setId(set.getInt("id"));
                user1.setLogin(set.getString("login"));
                user1.setEmail(set.getString("email"));
                user1.setPassword(set.getString("password"));
                user1.setDateOfReg(set.getTimestamp("date_of_reg"));
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null) set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<UserLog> userLoginList() {
        String sql = "select * from user_log";

        ArrayList<UserLog> userLogArrayList = null;

        try (Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet set = statement.executeQuery()) {

            while (set.next()) {
                UserLog userLog = new UserLog();
                userLog.setId(set.getInt("id"));
                userLog.setGood(set.getBoolean("is_good"));
                userLog.setUserId(set.getInt("user_id"));
                userLog.setTimeLogs(set.getTimestamp("time_log"));
                assert false;
                userLogArrayList.add(userLog);
            }
            return userLogArrayList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
