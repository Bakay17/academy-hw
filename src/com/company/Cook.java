package com.company;

public class Cook extends WorkingMan {
    private String dishesCooling;
    private String specialty;
    private String certificate;

    public Cook(String name, int age, String address, String sex, String position, int salary, int bonus, int penalty, String level, int vacationDays, String dishesCooling, String specialty, String certificate) {
        super(name, age, address, sex, position, salary, bonus, penalty, level, vacationDays);
        this.dishesCooling = dishesCooling;
        this.specialty = specialty;
        this.certificate = certificate;
    }

    public Cook(String dishesCooling, String specialty, String certificate) {
        this.dishesCooling = dishesCooling;
        this.specialty = specialty;
        this.certificate = certificate;
    }

    public Cook() {
    }

    public String getDishesCooling() {
        return dishesCooling;
    }

    public void setDishesCooling(String dishesCooling) {
        this.dishesCooling = dishesCooling;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
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
        System.out.println("Идет на работу в 9:00.");
    }

    @Override
    public void goOutToVacation() {
        System.out.println("Отпуск будет на следующей неделе.");
    }

    @Override
    public void beLateToWork() {
        System.out.println("Вчера опаздал, штраф в размере " + getPenalty() + " сомов");
    }

    public void goToFood(){
        System.out.println("Вчера ходил за продуктами.");
    }

    public void inventDish(){
        System.out.println("Придумал очень много блюд.");
    }

    public void cookingDish(){
        System.out.println("Сейчас готовит блюдо.");
    }

    @Override
    public String toString() {
        return "Повар\nИмя: " + getName() + "\nВозраст: " + getAge() + "\nПозиция: " + getPosition()
                + "\nЗарплата: " + getSalary() + "\nПремия: " + getBonus() + "\nШтраф: "
                + getPenalty() + "\nСтаж: " + getLevel() + "\nОтпуск: " + getVacationDays() + " дней";
    }
}
