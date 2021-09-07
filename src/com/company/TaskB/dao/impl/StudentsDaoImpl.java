package com.company.TaskB.dao.impl;

import com.company.TaskB.dao.BaseDao;
import com.company.TaskB.dao.StudentsDao;
import com.company.TaskB.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsDaoImpl extends BaseDao implements StudentsDao {

    public List<Student> getAll() {
        List<Student> students = null;
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement statement = null;
        try{
            connection = connect();
            statement = connection.prepareStatement("SELECT * FROM students");
            resultSet = statement.executeQuery();
            students = new ArrayList<>();

            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setFullName(resultSet.getString("fio"));
                student.setFkGroupId(resultSet.getInt("group_id"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return students;
    }

    public boolean updateStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("parameter not found");
        }
        if (student.getId() == null) {
            throw new IllegalArgumentException("given Student does not exist");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = connect();
            preparedStatement = connection
                    .prepareStatement("update students " +
                            "set " +
                            " fio = ?," +
                            " group_id = ?" +
                            " where id = ?");
            preparedStatement.setString(1, student.getFullName());
            preparedStatement.setInt(2, student.getFkGroupId());
            preparedStatement.setInt(3, student.getId());
            int count = preparedStatement.executeUpdate();
            return count > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                preparedStatement.close();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public int countStudents() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = connect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("   select count(*) from students\n");

            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return 0;
    }
}
