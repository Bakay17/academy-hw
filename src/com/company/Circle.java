package com.company;

public class Circle implements PaintCircle{
    private int radius;
    private String color;
    private boolean flag;

    public Circle(int radius, String color, boolean flag) {
        this.radius = radius;
        this.color = color;
        this.flag = flag;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void paint() {
        if (isFlag() == true) System.out.println("Круг нарисован)))");
        else System.out.println("Круг еще не нарисован(((");
    }

    @Override
    public String toString() {
        return String.format("Круг, радиус %s см, цвет %s.", getRadius(), getColor());
    }
}
