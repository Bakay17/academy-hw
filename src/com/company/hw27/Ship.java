package com.company.hw27;

public class Ship implements Floating {
    private String name;

    public Ship(){
    }

    public Ship(String name) {
        this.name = name;
    }

    @Override
    public void floating() {
        System.out.println("Я корабль под именем " + getName() + " и я плыву.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
