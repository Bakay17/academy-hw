package com.company;

public class Worker {
    private String name;
    private int age;
    private int salary;
    private int level;

    public Worker(String name, int age, int salary, int level) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.level = level;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
