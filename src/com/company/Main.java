package com.company;

public class Main {

    public static void main(String[] args) {
	    Bread bread = new Bread(20, 32, "Булка", false);
        System.out.println(bread.toString());
        bread.bake();
        System.out.println("___________________________________\n");

        Circle circle = new Circle(14, "Красный", false);
        System.out.println(circle.toString());
        circle.paint();
    }
}
