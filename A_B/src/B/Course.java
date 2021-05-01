package com.company;

public class Course {
    private String name;
    private String date;
    private int id;
    private String teacherName;

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

    public void showInfoCourse(){
        System.out.println("Курс: " + name);
        System.out.println("Начало курса: " + date);
        System.out.println("ID: " + id);
        System.out.println("Преподаватель: " + teacherName);
    }
}
