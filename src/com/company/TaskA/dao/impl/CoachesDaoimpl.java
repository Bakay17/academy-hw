package com.company.TaskA.dao.impl;

import com.company.TaskA.dao.BaseDao;
import com.company.TaskA.dao.CoachesDao;
import com.company.TaskA.model.Coaches;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CoachesDaoimpl extends BaseDao implements CoachesDao {
    public List<Coaches> getAll() {
        List<Coaches> coaches = null;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        try{
            connection = connect();
            statement = connection.prepareStatement("SELECT * FROM coaches");
            resultSet = statement.executeQuery();
            coaches = new ArrayList<>();

            while (resultSet.next()) {
                Coaches coaches1 = new Coaches();
                coaches1.setId(resultSet.getInt("id"));
                coaches1.setFullName(resultSet.getString("full_name"));
                coaches1.setPhone(resultSet.getString("phone"));
                coaches1.setInn(resultSet.getString("inn"));
                coaches1.setTypeOfSport(resultSet.getInt("type_of_sport"));
                coaches1.setSalary(resultSet.getInt("salary"));
                coaches.add(coaches1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return coaches;
    }

    public boolean updateCoaches(Coaches coaches) {
        if (coaches == null) {
            throw new IllegalArgumentException("parameter not found");
        }
        if (coaches.getId() == null) {
            throw new IllegalArgumentException("given Coaches does not exist");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = connect();
            preparedStatement = connection
                    .prepareStatement("update coaches " +
                            "set " +
                            " full_name = ?," +
                            " type_of_sport = ?" +
                            " where id = ?" +
                            " phone = ?" +
                            " inn = ?" +
                            " salary = ?");
            preparedStatement.setString(1, coaches.getFullName());
            preparedStatement.setInt(2, coaches.getTypeOfSport());
            preparedStatement.setInt(3, coaches.getId());
            preparedStatement.setString(4, coaches.getPhone());
            preparedStatement.setString(5, coaches.getInn());
            preparedStatement.setInt(6, coaches.getSalary());
            int count = preparedStatement.executeUpdate();
            return count > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                preparedStatement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public int countCoaches() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("   select count(*) from coaches\n" +
                    "    where id = 2");

            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return 0;
    }

    public int sumSalaryAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("   select sum(salary) from coaches");

            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return 0;
    }
}
