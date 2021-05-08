package com.company;

import java.util.Arrays;
import java.util.Random;

public class Lessons {
    private String date;
    private Student[] presentStudents;
    private Course lessonOfCourse;
    private String startTime;
    private String homeWork;
    private String exam;

    public Lessons(String date, Student[] presentStudents, Course lessonOfCourse, String startTime, String homeWork, String exam) {
        this.date = date;
        this.presentStudents = presentStudents;
        this.lessonOfCourse = lessonOfCourse;
        this.startTime = startTime;
        this.homeWork = homeWork;
        this.exam = exam;
    }

    public Lessons() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Student[] getPresentStudents() {
        return presentStudents;
    }

    public void setPresentStudents(Student[] presentStudents) {
        this.presentStudents = presentStudents;
    }

    public int printCountStudents(){
        int countStudent = 0;
        for (int i = 0; i < presentStudents.length; i++) {
            if (presentStudents[i].isFlag() == true){
                countStudent++;
            }
        }
        return countStudent;
    }

    public Course getLessonOfCourse() {
        return lessonOfCourse;
    }

    public void setLessonOfCourse(Course lessonOfCourse) {
        this.lessonOfCourse = lessonOfCourse;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(String homeWork) {
        this.homeWork = homeWork;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Дата: " + date + "\nПрисутсвующие студенты: " + printCountStudents() + "\nКурс: "
                + lessonOfCourse.getName() + "\nВремя начала: " + startTime + "\nДомашнее задание: " + homeWork + "\nЭкзамен: " + exam;
    }
}
