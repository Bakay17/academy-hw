package com.company.hw29;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        try(FileReader reader = new FileReader("C:\\Users\\User\\Desktop\\gitForum\\git-first\\src\\com\\company\\hw29\\Main.java")) {
            Scanner sc = new Scanner(reader);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
    }

    public static void sizeFile(File reader){
        long size = reader.length();
        if (size > 100) throw new IllegalStateException(reader.getName() + "размер файла большой: " + size);
    }

    // я эту домашку не понял, да и вообще тема с файлами(+ искючения) мне не очень хорошо дается. можно ее рахобрать в консультации
}
