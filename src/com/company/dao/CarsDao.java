package com.company.dao;

import com.company.model.Car;

import java.util.List;

public interface CarsDao {
    List<Car> getAll();
    boolean save(Car car);
}
