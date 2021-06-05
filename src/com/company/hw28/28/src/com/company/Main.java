package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws IOException {
        Song song = new Song("Привычка", "Скриптонит", "Я в такой же майке, что и десять лет назад\n" +
                "Правда тот квадрат был довольно тесноват\n" +
                "Блокнул их лейап, сделал в стиле акробат\n" +
                "Запах дыма и закат, мы богаты без зарплат\n" +
                "Этот трек я помню на кассете (2002)\n" +
                "Вклеил минут 15 в середине, чтобы записать его\n" +
                "Щас включил всё на виниле, в косяке не палево\n" +
                "В меру хапнул пиздеца, в меру волевой\n" +
                "Чтоб могли вот так здесь собраться (эй-эй)\n" +
                "И это было нелегко, если вкратце\n" +
                "Не аул — svo, а много лет утекло с потом\n" +
                "Здесь вокруг, как будто спид-инфо, папарацци\n" +
                "Вам нужны бельё и хлеб, а мы жарим мясо", "Реп");

        FileWriter fileWriter = new FileWriter("file1");
        fileWriter.write(song.getName() + "\n");
        fileWriter.write(song.getAuthor() + "\n");
        fileWriter.write(song.getType() + "\n");
        fileWriter.write(song.getTextSong());
        fileWriter.close();
    }
}