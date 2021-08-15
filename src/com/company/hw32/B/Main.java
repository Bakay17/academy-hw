package com.company.hw32.B;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> animalsLinkedList = new LinkedList<>();
        LinkedList<Object> newList = new LinkedList<>();
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> sortLinkedList = new LinkedList<>();

        int catCount = 0;
        int dogCount = 0;
        int mouseCount = 0;

        keepToLinkedList(animalsLinkedList);
        remove5ToIndex(animalsLinkedList, catCount);
        addMouse3(animalsLinkedList, dogCount, mouseCount);
        addNewList(animalsLinkedList, newList);
        addToArrayList(animalsLinkedList, arrayList);
        sumAge(sortLinkedList, animalsLinkedList, arrayList);
    }

    public static void keepToLinkedList(LinkedList<Object> linkedList) {
        for (int i = 0; i < 50; i++) {
            linkedList.add(new Cat("Cat", i + 1));
            linkedList.add(new Dog("Dog", i + 1));
        }
        System.out.println("Добавили кошек и собак в LinkedList\n" + linkedList);
        System.out.println("_____________________________________________________");
    }


    public static void remove5ToIndex(LinkedList<Object> linkedList, int count) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof Cat) {
                count++;
                if (count % 5 == 0) linkedList.remove(linkedList.get(i));
            }
        }
        System.out.println("Удаление каждой 5й кошки:\n" + linkedList);
        System.out.println("_____________________________________________________");
    }


    public static void addMouse3(LinkedList<Object> linkedList, int dogCount, int mouseCount) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof Dog) {
                dogCount++;
                if (dogCount % 3 == 0) {
                    mouseCount++;
                    linkedList.add(linkedList.indexOf(linkedList.get(i)) + 1, new Mouse("Mouse", mouseCount));
                }
            }
        }
        System.out.println("Вставили мушку после каждой 3й собаки:\n" + linkedList);
        System.out.println("_____________________________________________________");
    }


    public static void addNewList(LinkedList<Object> linkedList, LinkedList<Object> newList){
        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = 0; j < linkedList.size(); j++) {
                if (linkedList.get(i) instanceof Cat && linkedList.get(j) instanceof Mouse) {
                    if (linkedList.indexOf(linkedList.get(i)) - linkedList.indexOf(linkedList.get(j)) == 1 ||
                         linkedList.indexOf(linkedList.get(i)) - linkedList.indexOf(linkedList.get(j)) == - 1) {
                        newList.add(linkedList.get(i));
                        newList.add(linkedList.get(j));
                    }
                }
            }
        }
        System.out.println("Добавили в новый лист стоящих рядом кошек и мышек:\n" + newList);
        System.out.println("_____________________________________________________");
    }


    public static void addToArrayList(LinkedList<Object> linkedList, ArrayList<Object> arrayList){
        arrayList.add(linkedList);
        System.out.println("Переместили в ArrayList:\n" + arrayList);
        System.out.println("_____________________________________________________");
    }


    public static void sumAge(LinkedList<Object> sortLinkedList, LinkedList<Object> linkedList, ArrayList<Object> arrayList){
        int dogAge = 0;
        int catAge = 0;
        int mouseAge = 0;

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) instanceof Cat) {
                catAge = catAge + ((Cat)linkedList.get(i)).getAge();
                sortLinkedList.addFirst((Cat)linkedList.get(i));
            }
            if (linkedList.get(i) instanceof Dog) {
                dogAge = dogAge + ((Dog) linkedList.get(i)).getAge();
                sortLinkedList.add(sortLinkedList.size() / 2 + 1, ((Dog)linkedList.get(i)));
            }
            if (linkedList.get(i) instanceof Mouse) {
                mouseAge = mouseAge + ((Mouse) linkedList.get(i)).getAge();
                sortLinkedList.addLast((Mouse) linkedList.get(i));
            }
        }
        System.out.println("Возраст кошек: " + catAge + "\nВозраст собак: " + dogAge + "\nВозраст мышек: " + mouseAge);
        System.out.println("_____________________________________________________");
        System.out.println("Сначало кошки, потом собаки и мыши: \n" + sortLinkedList);
    }
}
