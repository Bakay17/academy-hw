package com.company;

import java.security.Key;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        display.setDiagonal(16);
        display.setManufacturer("LG");
        display.setMatrixType("IPS");


        HDD disk = new HDD();
        disk.setMemorySize(1000);
        disk.setNumDisks(3);


        RAM ozu = new RAM();
        ozu.setMemorySizeOfRAM(8);
        ozu.setBrandOfRAM("GoodRAM");

        float[] portTypeOfUSB = new float[] {2, 3};
        USB usb = new USB();
        usb.setPortType(portTypeOfUSB);
        usb.setIdPort("STP");


        char[] chars = { '!', '*', '№', '$', '%', '&'};
        Keyboard key = new Keyboard();
        key.setLayoutOfKeyboard(chars);
        key.setBackLight(false);
        key.setAddKeys(true);
        

        Computer computer = new Computer(display, "Grey", "Acer", disk, ozu, 12, usb, key);

        computer.MyComputer();
    }
}
