package com.company;

public class Lavash extends Hleb{
    public Lavash(boolean bake, String wrapUp) {
        super(bake, wrapUp);
    }

    public Lavash() {
    }

    @Override
    public boolean isBake() {
        return super.isBake();
    }

    @Override
    public void setBake(boolean bake) {
        super.setBake(bake);
    }

    @Override
    public String getWrapUp() {
        return super.getWrapUp();
    }

    @Override
    public void setWrapUp(String wrapUp) {
        super.setWrapUp(wrapUp);
    }

    public String printLavashsBake(){
        if (isBake() == true) return "Я лаваш, меня испекли";
        else return "Я еще не готов";
    }

    @Override
    public String toString() {
        return "------------------------\nЛаваш: Элитный лаваш из Дилижана\nУпаковка: " + getWrapUp() + "\nИспечен: " + printLavashsBake();
    }
}
