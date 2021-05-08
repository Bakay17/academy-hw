package com.company;

public class Course {
    private String name;
    private String date;
    private int id;
    private String teacherName;

    public Course(String name, String date, int id, String teacherName) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.teacherName = teacherName;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Это курс " + name + ", преподаватель " + teacherName;
    }
}
