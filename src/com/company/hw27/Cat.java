package com.company.hw27;

public class Cat implements Running {
    private String name;

    public Cat(){
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Зовут меня " + getName() + ", хорошо убегаю от собак.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
