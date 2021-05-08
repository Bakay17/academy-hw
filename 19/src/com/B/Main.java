package com.company;

public class Main {

    public static void main(String[] args) {
	    Nan nan = new Nan(true, "Упакован", "()()", 20, 100);
        System.out.println(nan.toString());

	    Lavash lavash = new Lavash(true, "Завернут");
        System.out.println(lavash.toString());

	    Baguette baguette = new Baguette(true, "Упакован", 40, 5);
        System.out.println(baguette.toString());
    }
}
