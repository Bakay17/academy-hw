package com.company;

public class Kommersant extends Worker implements Comparable<Kommersant> {
    public Kommersant(String name, int age, int salary, int level) {
        super(name, age, salary, level);
    }

    public Kommersant() {
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public int getLevel() {
        return super.getLevel();
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
    }

    @Override
    public void compareTo(Kommersant o, Kommersant o2) {

    }
}
