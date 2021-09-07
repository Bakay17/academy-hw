package org.example.dao;

import org.example.model.User;
import org.example.model.UserLog;

import java.util.List;

public interface UsersDao {
    User createUser(User user);
    UserLog createUserLog(UserLog userLog);
    User checkUserLogin(String userLogin);
    User checkUserEmail(String userEmail);
    List<UserLog> userLoginList();
}
