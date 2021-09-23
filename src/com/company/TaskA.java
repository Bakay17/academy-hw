package com.company;

import java.util.HashMap;
import java.util.Map;

public class TaskA {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            hashMap.put(i, "Map = " + i);
        }

        hashMap.entrySet().stream()
                .filter(n -> n.getKey() > 5)
                .forEach(n -> System.out.println(n.getValue()));

        hashMap.entrySet().stream()
                .filter(n -> n.getKey() % 3 == 0)
                .forEach(n -> System.out.print(n.getValue() + ", "));

        System.out.println(hashMap.entrySet().stream()
                .filter(n -> n.getValue().length() > 5)
                .map(Map.Entry::getKey)
                .reduce((x, y) -> x * y).get());
    }
}
