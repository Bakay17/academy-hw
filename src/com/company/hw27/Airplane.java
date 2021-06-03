package com.company.hw27;

public class Airplane implements Flying {
    private int speed;

    public Airplane(int speed) {
        this.speed = speed;
    }

    public Airplane() {
    }

    @Override
    public void fly() {
        System.out.println("Сомалет летит со скоростью " + getSpeed() + " км/ч.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
