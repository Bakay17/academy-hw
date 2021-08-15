package com.company.hw30.B;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> evenIntegers = new ArrayList<>();
        ArrayList<Integer> notEvenIntegers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int n = rnd.nextInt(100);
            integers.add(n);
        }

        System.out.println("- Числа -(1 - 100)");
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + ", ");
        }

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 == 0){
                evenIntegers.add(integers.remove(i));
            }
        }

        System.out.println("\n- Четные -");
        for (int i = 0; i < evenIntegers.size(); i++) {
            System.out.print(evenIntegers.get(i) + ", ");
        }

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 != 0){
                notEvenIntegers.add(integers.remove(i));
            }
        }

        System.out.println("\n- Нечетные -");
        for (int i = 0; i < notEvenIntegers.size(); i++) {
            System.out.print(notEvenIntegers.get(i) + ", ");
        }
    }
}
