package com.company;

public class Baguette extends Hleb{
    private int length;
    private int countRub;

    public Baguette(boolean bake, String wrapUp, int length, int countRub) {
        super(bake, wrapUp);
        this.length = length;
        this.countRub = countRub;
    }

    public Baguette(int length, int countRub) {
        this.length = length;
        this.countRub = countRub;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCountRub() {
        return countRub;
    }

    public void setCountRub(int countRub) {
        this.countRub = countRub;
    }

    public Baguette(boolean bake, String wrapUp) {
        super(bake, wrapUp);
    }

    public Baguette() {
        super();
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

    public int rubcevot(){
        int rubcy = getCountRub()+1;
        return rubcy;
    }

    @Override
    public String toString() {
        return "------------------------\nБагет: Провансальский багет\nДлина: " + getLength() + "см\n"
                + "Разрезы: " + getCountRub() + "\nРубцы: " + rubcevot();
    }
}
