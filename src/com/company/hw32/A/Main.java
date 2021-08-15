package com.company.hw32.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> catsArrayList = new ArrayList<>();
        LinkedList<Cat> catLinkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            catsArrayList.add(new Cat("Cat" + (i+1)));
            catLinkedList.add(new Cat("Cat" + (i+1)));
        }

        addMiddle(catsArrayList, catLinkedList); // добавление в середину
        addBeginningAndEnd(catsArrayList, catLinkedList); // добавление в начало и конец
        readingMiddleEnd(catsArrayList, catLinkedList); // считывание от середины до конца
        removeMiddleEnd(catsArrayList, catLinkedList); // удаление
    }

    public static void addMiddle(ArrayList<Cat> arrayList, LinkedList<Cat> linkedList){
        System.out.println("Добавление в середину:");
        long millisBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(arrayList.size() / 2, new Cat("Cat1" + (i+1)));
        }
        long millisAfter = System.currentTimeMillis();
        long resultTime = millisAfter - millisBefore;
        System.out.println("  Через ArrayList заняло " + resultTime + " миллисекунд.");

        long millisBeforeLink = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.add(linkedList.size() / 2, new Cat("Cat1" + (i+1)));
        }
        long millisAfterList = System.currentTimeMillis();
        long resultTimeList = millisAfterList - millisBeforeLink;
        System.out.println("  Через LinkedList заняло " + resultTimeList + " миллисекунд.\n");
    }

    public static void addBeginningAndEnd(ArrayList<Cat> arrayList, LinkedList<Cat> linkedList){
        System.out.println("Добавление в начало и конец:");
        long millisBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            arrayList.add(0, new Cat("Cat1" + (i+1)));
            arrayList.add(arrayList.size(), new Cat("Cat2" + (i+1)));
        }
        long millisAfter = System.currentTimeMillis();
        long resultTime = millisAfter - millisBefore;
        System.out.println("  Через ArrayList заняло " + resultTime + " миллисекунд.");

        long millisBeforeLink = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linkedList.addFirst(new Cat("Cat1" + (i+1)));
            linkedList.addLast(new Cat("Cat2" + (i+1)));
        }
        long millisAfterList = System.currentTimeMillis();
        long resultTimeList = millisAfterList - millisBeforeLink;
        System.out.println("  Через LinkedList заняло " + resultTimeList + " миллисекунд.\n");
    }

    public static void readingMiddleEnd(ArrayList<Cat> arrayList, LinkedList<Cat> linkedList){
        System.out.println("Считывание с середины и конца:");
        long millisBefore = System.currentTimeMillis();
        System.out.println(arrayList.get(arrayList.size() / 2));
        System.out.println(arrayList.get(arrayList.size() - 1));
        long millisAfter = System.currentTimeMillis();
        long resultTime = millisAfter - millisBefore;
        System.out.println("  ArrayList заняло " + resultTime + " миллисекунд.");

        long millisBeforeLink = System.currentTimeMillis();
        System.out.println(linkedList.get(linkedList.size() / 2));
        System.out.println(linkedList.getLast());
        long millisAfterList = System.currentTimeMillis();
        long resultTimeList = millisAfterList - millisBeforeLink;
        System.out.println("  LinkedList заняло " + resultTimeList + " миллисекунд.\n");
    }

    public static void removeMiddleEnd(ArrayList<Cat> arrayList, LinkedList<Cat> linkedList){
        System.out.println("Удаление в середине и в начале:");
        long millisBefore = System.currentTimeMillis();
        arrayList.remove(arrayList.size()/2);
        arrayList.remove(0);
        long millisAfter = System.currentTimeMillis();
        long resultTime = millisAfter - millisBefore;
        System.out.println("  ArrayList заняло " + resultTime + " миллисекунд.");

        long millisBeforeLink = System.currentTimeMillis();
        linkedList.remove(linkedList.size() / 2);
        linkedList.removeFirst();
        long millisAfterList = System.currentTimeMillis();
        long resultTimeList = millisAfterList - millisBeforeLink;
        System.out.println("  LinkedList заняло " + resultTimeList + " миллисекунд.");
    }
}
