package com.company.CourseStudent;

public class Student {
    private String name;
    private String soname;
    private String man;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoname() {
        return soname;
    }

    public void setSoname(String soname) {
        this.soname = soname;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) System.out.println("Человек не можнт быть такого возраста!");
        else if (age > 100) System.out.println("Вы очень пожилой человек!");
        else this.age = age;
    }

    public void showInfo(){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + soname);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + man);
    }
}
