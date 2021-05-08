package com.company;

public class Nan extends Hleb{
    private String uzor;
    private int price;
    private int weight;

    public Nan(boolean bake, String wrapUp, String uzor, int price, int weight) {
        super(bake, wrapUp);
        this.uzor = uzor;
        this.price = price;
        this.weight = weight;
    }

    public Nan() {
    }

    public String getUzor() {
        return uzor;
    }

    public void setUzor(String uzor) {
        this.uzor = uzor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "------------------------\nЛепешка: Тойбос\nУпакован: " + getWrapUp() + "\nУзор: " + getUzor() + "\nЦена: " + getPrice() + "\nВес: " + getWeight();
    }
}
