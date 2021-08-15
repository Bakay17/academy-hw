package com.company.hw34;

import java.util.Random;

public class Dog {
    private int name; // сделал интом, что б каждому не придумывать имена
    private int age;

    public Dog(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(){
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        Random rnd = new Random();
        String[] str = new String[6];
        str[0] = "гуляю с хозяином по парку";
        str[1] = "купаюсь на луже";
        str[2] = "ищу мячик";
        str[3] = "грызу кость";
        str[4] = "гоняюсь за кошкой";
        str[5] = "сплю";
        return  String.format("%sя собака, возраст %s\nЧто я делаю:\n %s\n", getName(), getAge(), str[rnd.nextInt(str.length)]);
    }
}
