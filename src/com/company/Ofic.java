package com.company;

import java.util.Random;

public class Ofic extends WorkingMan {
    private Client clients;

    public Ofic(String name, int age, String address, String sex, String position, int salary, int bonus, int penalty, String level, int vacationDays, Client clients) {
        super(name, age, address, sex, position, salary, bonus, penalty, level, vacationDays);
        this.clients = clients;
    }

    public Ofic(){
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(String position) {
        super.setPosition(position);
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
    public int getBonus() {
        return super.getBonus();
    }

    @Override
    public void setBonus(int bonus) {
        super.setBonus(bonus);
    }

    @Override
    public int getPenalty() {
        return super.getPenalty();
    }

    @Override
    public void setPenalty(int penalty) {
        super.setPenalty(penalty);
    }

    @Override
    public String getLevel() {
        return super.getLevel();
    }

    @Override
    public void setLevel(String level) {
        super.setLevel(level);
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays();
    }

    @Override
    public void setVacationDays(int vacationDays) {
        super.setVacationDays(vacationDays);
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

    @Override
    public void goOutToWork() {
        super.goOutToWork();
    }

    @Override
    public void goOutToVacation() {
        super.goOutToVacation();
    }

    @Override
    public void beLateToWork() {
        super.beLateToWork();
    }

    public Client getClients() {
        return clients;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }

    public void acceptOrder(){
        System.out.println("Принимает заказ у " + clients.getName());
    }

    public void relateOrder(){
        System.out.println("Приносит заказ");
    }

    public void printCount(){
        System.out.println("Счет: " + clients.getAvrOrderCheck());
    }

    @Override
    public String toString() {
        return "\nИмя: " + getName() + "\nВозраст: " + getAge() + "\nПозиция: " + getPosition()
                + "\nЗарплата: " + getSalary() + "\nПремия: " + getBonus() + "\nШтраф: "
                + getPenalty() + "\nСтаж: " + getLevel() + "\nОтпуск: " + getVacationDays() + " дней";
    }
}
