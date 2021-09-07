package org.example.dao;

import org.example.config.DbConfig;
import org.example.model.UserModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoImpl extends DbConfig implements UserDao {

    @Override
    public boolean save(UserModel userModel) {
        String sql = "insert into user(name, password) values (?, ?)";
        try (Connection connection = DbConfig.connect();
             PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, userModel.getName());
            statement.setString(2, userModel.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<UserModel> getAll() {
        String sql = "select * from user";
        List<UserModel> userModelList = null;

        try (Connection connection = DbConfig.connect();
              PreparedStatement statement = connection.prepareStatement(sql);
              ResultSet set = statement.executeQuery()) {
            userModelList = new ArrayList<>();

            while (set.next()) {
                UserModel userModel = new UserModel();
                userModel.setId(set.getInt("id"));
                userModel.setName(set.getString("name"));
                userModel.setPassword(set.getString("password"));
                userModelList.add(userModel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
