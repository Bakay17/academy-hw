package com.company.TaskB;

import com.company.TaskB.dao.StudentsDao;
import com.company.TaskB.dao.impl.StudentsDaoImpl;
import com.company.TaskB.model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentsDao studentsDao = new StudentsDaoImpl();
        System.out.printf("В Группе %s студента\n", studentsDao.countStudents());

        List<Student> students = studentsDao.getAll();
        for(Student student : students) {
            System.out.println(student);
        }
    }
}
