package org.example;

public class Main {

    public static Integer num = 10;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MainThread(1));
        Thread thread2 = new Thread(new MainThread(2));
        Thread thread3 = new Thread(new MainThread(3));
        Thread thread4 = new Thread(new MainThread(4));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        //ответ не всегода одинаковый, гарантии не может быть
    }
}
