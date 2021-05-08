package com.company;

public class Hleb {
    private boolean bake;
    private String wrapUp;

    public Hleb(boolean bake, String wrapUp) {
        this.bake = bake;
        this.wrapUp = wrapUp;
    }

    public Hleb() {
    }

    public boolean isBake() {
        return bake;
    }

    public void setBake(boolean bake) {
        this.bake = bake;
    }

    public String getWrapUp() {
        return wrapUp;
    }

    public void setWrapUp(String wrapUp) {
        this.wrapUp = wrapUp;
    }
}
