package org.example;

import org.example.generic.MyGeneric;

public class Main {

    public static void main(String[] args) {
        MyGeneric<Integer, Integer> myGeneric = new MyGeneric<>(10, 10);

        System.out.println(myGeneric.showInfoOne());
        System.out.println(myGeneric.showInfoTwo());
        System.out.println(myGeneric.getOne());
        System.out.println(myGeneric.getTwo());
        System.out.println(myGeneric.check());
    }
}
