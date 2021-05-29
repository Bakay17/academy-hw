package com.company;

public class Bread implements BakeBread{
    private int size;
    private int weight;
    private String name;
    private boolean flag;

    public Bread() {
    }

    public Bread(int size, int weight, String name, boolean flag) {
        this.size = size;
        this.weight = weight;
        this.name = name;
        this.flag = flag;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void bake() {
        if (isFlag() == true) System.out.println("Хлеб выпечен!!!");
        else System.out.println("Хлеб еще не готовю...");
    }

    @Override
    public String toString() {
        return String.format("%s, %s см, %s гм.", getName(), getSize(), getWeight());
    }
}
