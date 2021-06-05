package com.company;

public class Firefighter extends Worker implements Comparable<Firefighter> {
    public Firefighter(String name, int age, int salary, int level) {
        super(name, age, salary, level);
    }

    public Firefighter() {
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
    public void compareTo(Firefighter o, Firefighter o2) {
        if (o.getLevel() > o2.getLevel()) System.out.printf("%s стажем старше чем %s", o.getName(), o2.getName());
        else if (o.getLevel() < o2.getLevel()) System.out.printf("%s стажем старше чем %s", o2.getName(), o.getName());
        else System.out.println("Они равны по стажу.");
    }
}
