package com.company.hw31;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите имя файла: ");
//        String str = sc.nextLine();
//        System.out.print("Введите расширение: ");
//        String str1 = sc.nextLine();
//        System.out.println(str + "." + str1);

        System.out.print("Введите имя файла: ");
        String str2 = sc.nextLine();
        System.out.println(str2.substring(0, 2));
        String result = "";

        for (int i = 0; i < str2.length(); i++) {
            if (str2.substring(i).equals(".")){
                String target = String.copyValueOf("{bbbbbb}".toCharArray());
                str2 = str2.replace(target, "");
            } else {
                System.out.println("asdsadsadsa");
            }
        }
        System.out.println(result);
    }
}
