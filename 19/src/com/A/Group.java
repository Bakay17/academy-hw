package com.company;

import java.util.Arrays;

public class Group{
    private Student[] studentArray;
    private Course courseStudents;
    private String startDay;
    private int month;

    public Group(Student[] studentArray, Course courseStudents, String startDay, int month) {
        this.studentArray = studentArray;
        this.courseStudents = courseStudents;
        this.startDay = startDay;
        this.month = month;
    }

    public Group() {
    }

    public Student[] getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(Student[] studentArray) {
        if (studentArray == null) System.out.println("Error");
        else this.studentArray = studentArray;
    }
    


    public Course getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(Course courseStudents) {
        this.courseStudents = courseStudents;
    }


    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Это группа по курсу " + courseStudents.getName() + ", в которой обучаются " + studentArray.length + " студента\n===============================";
    }
}
