package com.company.TaskA.model;

public class Coaches {
    private Integer id;
    private String fullName;
    private String phone;
    private String inn;
    private Integer typeOfSport;
    private Integer salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Integer getTypeOfSport() {
        return typeOfSport;
    }

    public void setTypeOfSport(Integer typeOfSport) {
        this.typeOfSport = typeOfSport;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + fullName + " salary: " + salary;
    }
}
