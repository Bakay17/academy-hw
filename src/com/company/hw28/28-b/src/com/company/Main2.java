package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("меняНеБудет.txt");
        FileWriter fileWriter = new FileWriter("меняНеБудет1.txt");
        Scanner sc = new Scanner(fileReader);
        String str = null;
    
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            fileWriter.write(str);
            System.out.print(str + "\n");
        }

        fileWriter.close();
        fileReader.close();
    }
}
