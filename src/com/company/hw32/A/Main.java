package com.company.hw32.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Cat> arrayCats = new ArrayList<>(1000000);
        List<Cat> linkCats = new LinkedList<>();

        ArrayList<Cat> cats100 = new ArrayList<>(100);

        for (int i = 0; i < cats100.size(); i++) {
            cats100.get(i).setAge(rnd.nextInt(20));
            System.out.println(cats100.toString());
        }

//        for (int i = 0; i < arrayCats.size(); i++) {
//            arrayCats.add(i);
//        }
    }
}
