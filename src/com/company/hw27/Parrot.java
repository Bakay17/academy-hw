package com.company.hw27;

public class Parrot implements Flying {
    private String color;

    public Parrot(){
    }

    public Parrot(String color) {
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("Я " + getColor() + " попугай хочу улететь от сюда!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
