package com.company.hw27;

public class Duck implements Floating, Flying {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public Duck(){
    }

    @Override
    public void floating() {
        System.out.println("Зовут меня " + getName()+ " и я плыву.");
    }

    @Override
    public void fly() {
        System.out.println("Я умею летатьььь(" + getName() + ")");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
