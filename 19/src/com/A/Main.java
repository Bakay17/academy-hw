package com.company;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Арсен", "Батыркулов", "мальчик", 19, true);
        students[1] = new Student("Султан", "Медетбеков", "мальчик", 19, false);
        students[2] = new Student("Дуулат", "Заидов", "мальчик", 19, true);

        System.out.println(students[0].toString());
        Course course = new Course("Java", "12.01.2021", 123123, "Aidin Sabyrov");
        System.out.println(course.toString());

        Group group = new Group(students, course, "12.03.2020", 10);
        System.out.println(group.toString());

        Lessons lessons = new Lessons("31.12.2019", students, course, "19:00", "Ничего не задавали", "Пока не было");
        System.out.println(lessons.toString());
        System.out.println("===============================");

    }
}
