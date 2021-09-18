package com.company.taskA;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Liquid> liquids = List.of(new Liquid() {
            @Override
            public void pourOver() {
                System.out.println("Я жидкость, и я переливаюсь");
            }
        });
        pourOverLiquid(liquids);
        pourOverLiquid(List.of(new Juice()));
    }

    public static void pourOverLiquid(List<? extends Liquid> liquids) {
        liquids.forEach(Liquid::pourOver);
    }
}
