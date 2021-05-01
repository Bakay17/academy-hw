package com.company;

public class Group {
    private Student[] studentArray;
    private Course courseStudents;
    private String startDay;
    private int month;

    public Student[] getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(Student[] studentArray) {
        if (studentArray == null) System.out.println("Error");
        else this.studentArray = studentArray;
    }
    
    public void printStudentArray(Student[] studentArray){
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i].showInfo();
        }
    }

    public Course getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(Course courseStudents) {
        this.courseStudents = courseStudents;
    }

    public void printCourseStudents(Course courseStudents){
        courseStudents.showInfoCourse();
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

    public void printInfoGroup(){
        System.out.println("\n---------\nГруппа:");
        printStudentArray(getStudentArray());
        System.out.println("\nИнформация о курсе:");
        printCourseStudents(getCourseStudents());
        System.out.println("Стартовый день: " + startDay);
        System.out.println("Прдолжительность: " + month + " месяцев.\n----------\n");
    }
}
