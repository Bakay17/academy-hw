package com.company.hw27;

public class Whale implements Floating {
    private int weight;

    public Whale(){
    }

    public Whale(int weight) {
        this.weight = weight;
    }

    @Override
    public void floating() {
        System.out.println("Кит с весом " + getWeight() + " тонн очень медленно плавает.");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
