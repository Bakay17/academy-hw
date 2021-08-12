package com.company.model;

public class Car {
    private Integer id;
    private String carsName;

    public Car(Integer id, String carsName) {
        this.id = id;
        this.carsName = carsName;
    }

    public Car(String carsName) {
        this.carsName = carsName;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarsName() {
        return carsName;
    }

    public void setCarsName(String carsName) {
        this.carsName = carsName;
    }
}
