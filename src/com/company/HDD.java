package com.company;

public class HDD {
    private int memorySize;
    private int numDisks;

    public HDD(int memorySize, int numDisks) {
        this.memorySize = memorySize;
        this.numDisks = numDisks;
    }

    public HDD() {
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getNumDisks() {
        return numDisks;
    }

    public void setNumDisks(int numDisks) {
        this.numDisks = numDisks;
    }

    public void InfoOfHdd(){
        System.out.println(memorySize + ", Количество дисков: " + numDisks);
    }
}
