package com.company;

import java.security.Key;

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
        key.setBackLight(true);
        key.setAddKeys(true);


        Computer comp = new Computer();
        comp.setDisplayCom(display);
        comp.setColor("Grey");
        comp.setBrand("Acer");
        comp.setHdd(disk);
        comp.setRam(ozu);
        comp.setGraphicsCard(12);
        comp.setUsb(usb);
        comp.setKeyboard(key);

        comp.MyComputer();
    }
}
