package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Work work = new Work();
        Test test = new Test();
        JFrame jFrame = new JFrame();
        jFrame.setSize(1000, 1000);
        jFrame.setTitle("Кубическая");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(test);
        jFrame.setVisible(true);
    }
}
