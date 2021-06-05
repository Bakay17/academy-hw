package com.company;

public class Song {
    private String name;
    private String author;
    private String textSong;
    private String type;

    public Song(String name, String author, String textSong, String type) {
        this.name = name;
        this.author = author;
        this.textSong = textSong;
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

    public String getTextSong() {
        return textSong;
    }

    public void setTextSong(String textSong) {
        this.textSong = textSong;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
