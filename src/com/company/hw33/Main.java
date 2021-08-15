package com.company.hw33;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Month[] months = Month.values();
        ArrayList <Month> monthArrayList = new ArrayList <Month> (Arrays.asList (Month.values()));
        LinkedList <Month> monthLinkedList = new LinkedList<Month>(Arrays.asList(Month.values()));
        EnumArray enumArray = new EnumArray(months);

        // пузырьковая соортировка (только с массивом)
        System.out.println("До сортировки:");
        EnumArray.printer(months);

        enumArray.bubbleSorter(months);
        System.out.println("\nСортировка по количеству символов: ");
        EnumArray.printer(months);

        System.out.println("\n--------------------------");

        EnumArray.printer(monthArrayList);
        enumArray.bubbleSorter(monthArrayList);
        System.out.println("");
        EnumArray.printer(monthArrayList);




        // здесь перегрузка методов
        System.out.println("\n--- Массив ---");
        sortMonth(months);
        System.out.println("\n--- ArrayList ---");
        sortMonth(monthArrayList);
        System.out.println("\n--- LinkedList ---");
        sortMonth(monthLinkedList);
    }

    public static void sortMonth(Month[] months){
        for (int i = 0; i < months.length; i++) {
            System.out.print(" " + months[i].toString());
        }
    }

    public static void sortMonth(ArrayList<Month> month){
        System.out.println(month.toString());
    }

    public static void sortMonth(LinkedList<Month> month){
        System.out.println(month.toString());
    }
}
