package com.company;

public class Song {
    private String name;
    private String author;
    private String text;
    private String type;

    public Song(String name, String author, String text, String type) {
        this.name = name;
        this.author = author;
        this.text = text;
        this.type = type;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
