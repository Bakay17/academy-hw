package com.company;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(12);
        linkedList.add(117);
        System.out.println(linkedList.get(1));


        ListIterator<Integer> iterator = linkedList.listIterator(2);
        if (iterator.hasNext()) {
            System.out.println("Previous = " + iterator.previous()); // тут одно выражение
            System.out.println("Next = " + iterator.nextIndex());
            System.out.println("Previous = " + iterator.previous());  // тут другое выражене
        }

    }
}
