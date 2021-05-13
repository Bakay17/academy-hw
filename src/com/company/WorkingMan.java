package com.company;

public class WorkingMan extends Human {
    private String position;
    private int salary;
    private int bonus;
    private int penalty;
    private String level;
    private int vacationDays;

    public WorkingMan(String name, int age, String address, String sex, String position, int salary, int bonus, int penalty, String level, int vacationDays) {
        super(name, age, address, sex);
        this.position = position;
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.level = level;
        this.vacationDays = vacationDays;
    }

    public WorkingMan() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
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
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String getSex() {
        return super.getSex();
    }

    @Override
    public void setSex(String sex) {
        super.setSex(sex);
    }

    public void goOutToWork(){

    }

    public void goOutToVacation(){

    }

    public void beLateToWork(){

    }

    @Override
    public String toString() {
        return "";
    }
}
