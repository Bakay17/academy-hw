package com.company.Main;

import com.company.CourseStudent.Course;
import com.company.CourseStudent.Student;

public class Lessons {
    private String date;
    private Student[] presentStudents;
    private Course lessonOfCourse;
    private String startTime;
    private String homeWork;
    private String exam;

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
}
