package com.company.hw32.A;

public class Cat {
    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
