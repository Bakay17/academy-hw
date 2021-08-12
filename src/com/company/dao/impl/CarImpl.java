package com.company.dao.impl;

import com.company.dao.BaseDao;
import com.company.dao.CarsDao;
import com.company.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarImpl extends BaseDao implements CarsDao {
    @Override
    public List<Car> getAll() {
        List<Car> car = null;
        ResultSet set = null;
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = connect();
            statement = connection.prepareStatement("select * from coaches");
            set = statement.executeQuery();
            car = new ArrayList<>();

            while (set.next()) {
                Car car1 = new Car();
                car1.setId(set.getInt("id"));
                car1.setCarsName(set.getString("cars_name"));
                car.add(car1);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert set != null;
                set.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return car;
    }

    @Override
    public boolean save(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("parameter not found");
        }

        if (car.getId() == null) {
            throw new IllegalArgumentException("gives Car does not exist");
        }

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connect();
            statement = connection.prepareStatement("insert into cars(cars_name)\n" +
                                                    "values(?)");
            statement.setString(1, car.getCarsName());
            int count = statement.executeUpdate();
            return count > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
