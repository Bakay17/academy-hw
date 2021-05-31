package com.company.hw26;

public class Main {

    public static void main(String[] args) {
        Monkey monkey = new Monkey("Обезьяна", 7);
        Monkey monkey1 = new Monkey("Обезьяна2", 5);
        System.out.println(monkey.toString());
        monkey.climbMonkey();
        monkey.clim(monkey1);
    }
}
