package com.company;

import com.company.dao.CarsDao;
import com.company.dao.impl.CarImpl;
import com.company.model.Car;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        CarsDao carDao = new CarImpl();
        Car car1 = new Car(1,"BMW");
        Car car2 = new Car(2,"Lada");
        Car car3 = new Car(3,"Toyota");
        Car car4 = new Car(4,"Audi");
        Car car5 = new Car(5,"Nissan");

        Car[] cars = new Car[5];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;

        for (Car car : cars) {
            carDao.save(car);
        }

        HashMap<Integer, String> hashMapCar = new HashMap<>();
        for (Car car : cars) {
            hashMapCar.put(car.getId(), car.getCarsName());
        }
        System.out.println(hashMapCar);
    }
}
