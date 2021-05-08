package com.company;

public class Student {
    private String name;
    private String soname;
    private String man;
    private int age;
    boolean flag;

    public Student(String name, String soname, String man, int age, boolean flag) {
        this.name = name;
        this.soname = soname;
        this.man = man;
        this.age = age;
        this.flag = flag;
    }

    public Student() {
    }

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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "===============================\nЯ студент " + getName() + " " + getSoname() + ", возраст " + getAge();
    }

}
