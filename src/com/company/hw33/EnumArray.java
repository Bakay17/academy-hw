package com.company.hw33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class EnumArray {
    Month[] months = Month.values();
    ArrayList <Month> monthArrayList = new ArrayList<Month>(Arrays.asList (Month.values()));
    LinkedList <Month> monthLinkedList = new LinkedList<Month>(Arrays.asList(Month.values()));

    public EnumArray(Month[] month){
        months = new Month[month.length];
    }
    public EnumArray(ArrayList<Month> month){
        months = new Month[month.size()];
    }
    public EnumArray(LinkedList<Month> month){
        months = new Month[month.size()];
    }

    // Массив
    private void changeOfElement(int a, int b, Month[] months){
        Month month = months[a];
        months[a] = months[b];
        months[b] = month;
    }

    public static void printer(Month[] month){
        for (int i = 0; i < month.length; i++) {
            System.out.print(" " + month[i].toString());
        }
    }

    public void bubbleSorter(Month[] month){
        for (int i = month.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (month[j].getTitle().length() < month[j+1].getTitle().length()){
                    changeOfElement(j, j + 1, month);
                }
            }
        }
    }


    // ArrayList
    private void changeOfElement(int a, int b, ArrayList<Month> arrayList){
        Month month = months[a];
        months[a] = months[b];
        months[b] = month;
    }

    public static void printer(ArrayList<Month> arrayList){
        System.out.print(" " + arrayList.toString());
    }

    public void bubbleSorter(ArrayList<Month> list){
        Month temp;
        if (list.size()>1){
            for (int x=0; x<list.size(); x++){
                for (int i=0; i < list.size()-i; i++) {
                    if (list.get(i).compareTo(list.get(i+1)) > 0) {
                        temp = list.get(i);
                        list.set(i, list.get(i+1) );
                        list.set(i+1, temp);
                    }
                }
            }
        }
    }
}
