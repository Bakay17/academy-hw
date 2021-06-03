package com.company.hw27;

public class Man implements Running, Floating {
    private String name;
    private int height;

    public Man(){
    }

    public Man(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public void floating() {
        System.out.println("Человек по имени " + getName() + " ходит на плавание.");
    }

    @Override
    public void run() {
        System.out.println(getName() +  " еще с ростом " + getHeight() + " хорошо бегает.");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
