package com.company;

public class RAM {
    private int memorySizeOfRAM;
    private String brandOfRAM;

    public RAM(int memorySizeOfRAM, String brandOfRAM) {
        this.memorySizeOfRAM = memorySizeOfRAM;
        this.brandOfRAM = brandOfRAM;
    }

    public RAM() {
    }

    public int getMemorySizeOfRAM() {
        return memorySizeOfRAM;
    }

    public void setMemorySizeOfRAM(int memorySizeOfRAM) {
        this.memorySizeOfRAM = memorySizeOfRAM;
    }

    public String getBrandOfRAM() {
        return brandOfRAM;
    }

    public void setBrandOfRAM(String brandOfRAM) {
        this.brandOfRAM = brandOfRAM;
    }

    public void InfoOfRAM(){
        System.out.println(memorySizeOfRAM + ", " + brandOfRAM);
    }
}
