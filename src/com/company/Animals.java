package com.company;

public class Animals {
    private String name;
    private String sex;
    private int age;
    private int weight;

    public Animals(String name, String sex, int age, int weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }

    public Animals() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String cowsInfo(){
        String str = "Кличка: " + getName() + " Пол: " + getSex() + " Возраст: " + getAge() + " Вес: " + getWeight();
//        System.out.println("Кличка: " + getName() + " Пол: " + getSex() + " Возраст: " + getAge() + " Вес: " + getWeight());
        return str;
    }
}
