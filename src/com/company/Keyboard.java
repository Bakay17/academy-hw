package com.company;

import java.util.Random;

public class Keyboard {
    private char[] layoutOfKeyboard;
    private boolean backLight;
    private boolean addKeys;

    public Keyboard(char[] layoutOfKeyboard, boolean backLight, boolean addKeys) {
        this.layoutOfKeyboard = layoutOfKeyboard;
        this.backLight = backLight;
        this.addKeys = addKeys;
    }

    public Keyboard() {
    }

    public char[] getLayoutOfKeyboard() {
        return layoutOfKeyboard;
    }

    public void setLayoutOfKeyboard(char[] layoutOfKeyboard) {
        this.layoutOfKeyboard = layoutOfKeyboard;
    }

    public void printLayout(){
        Random rnd = new Random();
        int n = rnd.nextInt(2)+1;
        for (int i = 0; i < layoutOfKeyboard.length; i++) {
            System.out.print(layoutOfKeyboard[i] + " ");
        }
    }

    public boolean isBackLight() {
        return backLight;
    }

    public void setBackLight(boolean backLight) {
        this.backLight = backLight;
    }

    public boolean isAddKeys() {
        return addKeys;
    }

    public void setAddKeys(boolean addKeys) {
        this.addKeys = addKeys;
    }

    public void InfoKeyboard(){
        System.out.print("массив расскладок: ");
        printLayout();
        System.out.println(", подсветка: " + backLight + ", доп цифры: " + addKeys);
    }
}
