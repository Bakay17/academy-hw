package com.company;

public class Security extends WorkingMan {
    private String armed;
    private String armedType;
    private Client[] clients;

    public Security(String name, int age, String address, String sex, String position, int salary, int bonus, int penalty, String level, int vacationDays, String armed, String armedType, Client[] clients) {
        super(name, age, address, sex, position, salary, bonus, penalty, level, vacationDays);
        this.armed = armed;
        this.armedType = armedType;
        this.clients = clients;
    }

    public Security(String armed, String armedType, Client[] clients) {
        this.armed = armed;
        this.armedType = armedType;
        this.clients = clients;
    }

    public Security(String armed, String armedType) {
        this.armed = armed;
        this.armedType = armedType;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public Security() {
    }

    public String getArmed() {
        return armed;
    }

    public void setArmed(String armed) {
        this.armed = armed;
    }

    public String getArmedType() {
        return armedType;
    }

    public void setArmedType(String armedType) {
        this.armedType = armedType;
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

    public void faceControl(){
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].isFaceControl() == false) System.out.printf("Клиент %s не прошел фейсконтроль.\n", clients[i].getName());
        }
    }

    public void peopleOut(){
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].isFaceControl() == false) System.out.printf("Охрана выгнала клиента %s", clients[i].getName());
        }
    }

    @Override
    public String toString() {
        return "-------------------------\nОхрана\nИмя: " + getName() + "\nВозраст: " + getAge() + "\nПозиция: " + getPosition()
                + "\nЗарплата: " + getSalary() + "\nПремия: " + getBonus() + "\nШтраф: "
                + getPenalty() + "\nСтаж: " + getLevel() + "\nОтпуск: " + getVacationDays() + " дней"
                + "\nВооружен: " + getArmed() + "\nТип оружия: " + getArmedType();
    }
}
