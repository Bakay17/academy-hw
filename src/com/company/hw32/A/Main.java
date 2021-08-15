package com.company.hw32.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<ArrayList<Cat>> arrayCats = new ArrayList<>(1000000);
        List<Cat> linkCats = new LinkedList<>();

        int n = 0;
        for (int i = 0; i < arrayCats.size(); i++) {
            n++;
        }
        System.out.println(arrayCats);

        ArrayList<Cat> cats100 = new ArrayList<>(100);

        arrayCats.add(arrayCats.size()/2, cats100);

        int count = 0;
        for (int i = 0; i < arrayCats.size(); i++) {
            count++;
        }
        System.out.println(arrayCats);

//        for (int i = 0; i < arrayCats.size(); i++) {
//            arrayCats.add(i);
//        }
    }
}
