package com.company.dao;

import com.company.model.User;

public interface UserDao {
    User createUser(User user);
    User checkUser(String login);
    int countFalseLogin(int id);
    void deleteLogin(int id);
}
