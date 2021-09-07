package com.company.TaskB.dao;

import com.company.TaskB.model.Student;

import java.util.List;

public interface StudentsDao {
    List<Student> getAll();
    boolean updateStudent(Student student);
    int countStudents();
}
