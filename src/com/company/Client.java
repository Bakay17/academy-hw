package com.company;

public class Client extends Human {
    private String regular;
    private int avrOrderCheck;
    private boolean faceControl;

    public Client(String name, int age, String address, String sex, String regular, int avrOrderCheck, boolean faceControl) {
        super(name, age, address, sex);
        this.regular = regular;
        this.avrOrderCheck = avrOrderCheck;
        this.faceControl = faceControl;
    }

    public Client(String regular, int avrOrderCheck, boolean faceControl) {
        this.regular = regular;
        this.avrOrderCheck = avrOrderCheck;
        this.faceControl = faceControl;
    }

    public Client(){
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public int getAvrOrderCheck() {
        return avrOrderCheck;
    }

    public void setAvrOrderCheck(int avrOrderCheck) {
        this.avrOrderCheck = avrOrderCheck;
    }

    public boolean isFaceControl() {
        return faceControl;
    }

    public void setFaceControl(boolean faceControl) {
        this.faceControl = faceControl;
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

    public String faceControlClients(){
        if (isFaceControl() == true) return "Прошел";
        else return "Не прошел";
    }

    public void toOrder(){
        System.out.println("Сделал заказ");
    }

    public void toPaid(){
        System.out.println("Оплатил счет");
    }

    public void callTheOfic(){
        System.out.println("Зовет официанта");
    }

    @Override
    public String toString() {
        return "-------------------------\nКлиент\nИмя: " + getName() + "\nВозраст: " + getAge() + "\nПол: " + getSex()
                + "\nПостоянный: " + getRegular() + "\nСредний чек заказа: " + getAvrOrderCheck() + "\nФейс контроль: "
                + faceControlClients();
    }
}
