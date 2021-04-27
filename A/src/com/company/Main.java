package com.company;

public class Main {

    public static void main(String[] args) {
        Student st = new Student();
        boolean flag = false;

        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].name = "Александр";
        students[0].age = 21;
        students[0].course = 3;
        students[0].university = "KNU";

        System.out.printf("%s учиться в %s в %s курсе, ему %s год.\n", students[0].name, students[0].university, students[0].course, students[0].age);

        students[1] = new Student();
        students[1].name = "Эмир";
        students[1].age = 19;
        students[1].course = 1;
        students[1].university = "Политех";

        System.out.printf("%s учиться в %s в %s курсе, ему %s лет.\n", students[1].name, students[1].university, students[1].course, students[1].age);

        students[2] = new Student();
        students[2].name = "Айэлита";
        students[2].age = 23;
        students[2].course = 5;
        students[2].university = "KTUM";

        System.out.printf("%s учиться в %s в %s курсе, ей %s года.", students[2].name, students[2].university, students[2].course, students[2].age);
    }
}
