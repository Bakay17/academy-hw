package com.company.hw31;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String name = sc.nextLine();


        System.out.println("Введите новое расщирение: ");
        String replacement = sc.nextLine();
        replacementIndexStr(name, replacement);
    }

    public static void replacementIndexStr(String first, String second){
        int counter = 0;
        int index = 0;

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == '.'){
                counter++;
                index = i;
            }
        }

        if (counter == 0){
            System.out.println(first + "." + second);
        } else {
            String second2 = "";
            String first1 = "";
            
            for (int i = 0; i < index; i++) {
                first1 += first.charAt(i);
            }

            for (int i = index + 1; i < first.length(); i++) {
                second2 += first.charAt(i);
            }

            if (!second2.equals(second)){
                System.out.println(first1 + "." + second);
            }
        }
    }
}
