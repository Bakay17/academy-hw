package com.company.hw27;

public class Main {

    public static void main(String[] args) {
        Floating[] floating = new Floating[5];
        floating[0] = new Duck("Дональд");
        floating[1] = new Ship("Титаник");
        floating[2] = new Shark("Мегаладон");
        floating[3] = new Whale(102);
        floating[4] = new Man("Артур", 180);

        System.out.println("------------- Плавцы -----------");
        for (int i = 0; i < floating.length; i++) {
            floating[i].floating();
        }

        Flying[] flyings = new Flying[3];
        flyings[0] = new Airplane(2500);
        flyings[1] = new Duck("Даффи");
        flyings[2] = new Parrot("Красный");

        System.out.println("\n------------- Летуны -----------");
        for (int i = 0; i < flyings.length; i++) {
            flyings[i].fly();
        }

        Running[] running = new Running[2];
        running[0] = new Man("Сергей", 178);
        running[1] = new Cat("Том");

        System.out.println("\n------------- Бегуны -----------");
        for (int i = 0; i < running.length; i++) {
            running[i].run();
        }

    }
}
