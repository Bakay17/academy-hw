package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TaskB {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100)+1);
        }

        list.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);

        System.out.println();

        List<Integer> newList = list.stream()
                .filter(integer -> integer % 2 != 0)
                .map(integer -> integer + 10)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);

    }
}
