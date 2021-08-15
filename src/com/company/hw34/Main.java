package com.company.hw34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Dog> dogs = new ArrayList<>();
        Set<Dog> dogSet = new HashSet<>();

        for (int i = 1; i <= 40; i++) {
            dogs.add(new Dog (i, rnd.nextInt(20)));
        }

        for (int i = 0; i < dogs.size(); i++) {
            dogSet.add(dogs.get(i));
            System.out.println(dogs.get(i));
        }
    }
}
