package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Computer {
    private Display displayCom;
    private String color;
    private String brand;
    private HDD hdd;
    private RAM ram;
    private int graphicsCard;
    private USB usb;
    private Keyboard keyboard;

    public Computer(Display displayCom, String color, String brand, HDD hdd, RAM ram, int graphicsCard, USB usb, Keyboard keyboard) {
        this.displayCom = displayCom;
        this.color = color;
        this.brand = brand;
        this.hdd = hdd;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public Computer() {
    }

    public Display getDisplayCom() {
        return displayCom;
    }

    public void setDisplayCom(Display displayCom) {
        this.displayCom = displayCom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public int getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(int graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        if (usb == null) System.out.println("Error");
        else this.usb = usb;
    }

    public void printUsb(USB usb){
        usb.IfoOfUsb();
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void MyComputer(){
        System.out.println("Наш компьютер:");
        System.out.println("---------------------------");
        System.out.print("Дисплей: ");
        displayCom.InfoOfDisplay();
        System.out.println("Марка: " + brand);
        System.out.println("Цвет: " + color);
        System.out.print("Жесткий диск: ");
        hdd.InfoOfHdd();
        System.out.print("Оперативная память: ");
        ram.InfoOfRAM();
        System.out.println("Видео карта: " + graphicsCard);
        System.out.print("USB: ");
        printUsb(getUsb());
        System.out.print("Клавиатура: " );
        keyboard.InfoKeyboard();
        System.out.println("---------------------------");
    }
}
