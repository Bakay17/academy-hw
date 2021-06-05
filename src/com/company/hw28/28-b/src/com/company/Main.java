package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    Song song = new Song("Меня не будет", "ANIKV", "Я не ревную тебя\n" +
                "Просто мои загоны\n" +
                "Остановила себя\n" +
                "Выдохнуть и пойти снова\n" +
                "А не кричи на меня\n" +
                "Я обниму тебя, впрочем\n" +
                "Сколько всего ещё ты сломаешь\n" +
                "Как лавина скрыла метель\n" +
                "Половина наших недель\n" +
                "Вокруг людей куча, но меня не будет\n" +
                "Я хочу, чтоб ты почувствовал каково это\n" +
                "Вокруг людей куча, но меня не будет\n" +
                "Я хочу, чтоб ты почувствовал каково это", "Реп");

        FileWriter fileWriter = new FileWriter("меняНеБудет.txt");
        fileWriter.write(song.getName() + "\n");
        fileWriter.write(song.getAuthor() + "\n");
        fileWriter.write(song.getType() + "\n");
        fileWriter.write(song.getText() + "\n");

        fileWriter.close();
    }
}
