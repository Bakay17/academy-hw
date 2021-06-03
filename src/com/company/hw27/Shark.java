package com.company.hw27;

public class Shark implements Floating {
    private String name;

    public Shark(){
    }

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void floating() {
        System.out.println("Акула " + getName() + " устала плавать.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
