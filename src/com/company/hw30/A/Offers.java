package com.company.hw30.A;

public class Offers {
    private String text;

    public Offers(String text) {
        this.text = text;
    }

    public Offers() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return getText() + "\n";
    }
}
