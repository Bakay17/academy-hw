package com.company.hw26;

public class Monkey implements Climb, ClimbOnTheBack {
    private String name;
    private int age;

    public Monkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Monkey(){
    }

    @Override
    public void climbMonkey() {
        System.out.println("Он очень хорошо лазает по деревьям.");
    }

    @Override
    public void clim(Monkey monkey) {
        System.out.println(getName() + " носит на спине " + monkey.getName());
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

    @Override
    public String toString() {
        return String.format("%s, %s лет.", getName(), getAge());
    }
}
