package com.company;

import com.company.dao.UserDao;
import com.company.dao.impl.UserDaoImpl;
import com.company.model.User;
import com.company.model.UserLog;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static UserDao userDao = new UserDaoImpl();

    public static void main(String[] args) throws Exception {
        User user = new User();

        user.setPassword("qwe");
        user.setLogin("qwe");
        user.setEmail("qwe.gmail");

        registration(user);
        accountLogin(user);
        unBlock(user);
    }

    public static void registration(User user) throws Exception {
        if (user.getLogin() == null || user.getLogin().isEmpty()){
            throw new IllegalAccessException("Ввдеите правильно");
        }

        user = userDao.checkUser(user.getLogin());
        if (user != null) {
            throw new Exception("Такой логин уже существует");
        }

        user = userDao.createUser(user);
        if (user.getId() != null){
            System.out.println("Регистрация прошла успешна");
        } else
            System.out.println("Ошибка");
    }

    public static void accountLogin(User user){
        System.out.println("Введите логин:");
        String login = new Scanner(System.in).nextLine();
        System.out.println("Введите пароль:");
        String password = new Scanner(System.in).nextLine();

        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Неправильный логин");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Неправильный пароль");
        }

        boolean result;
        user = userDao.checkUser(login);
        if (user != null) {
            UserLog userLog = new UserLog();
            userLog.setUserId(user.getId());
            result = user.getPassword().equals(password);
            userLog.setFlag(result);

            if (userDao.countFalseLogin(user.getId()) < 3 && result) {
                userDao.deleteLogin(user.getId());
            }
        } else System.out.println("Пользователь не найден!");
    }

    public static void unBlock(User user) throws IllegalArgumentException {
        System.out.println("Введите логин:");
        String login = new Scanner(System.in).nextLine();
        System.out.println("Введите email:");
        String email = new Scanner(System.in).nextLine();

        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Неправильный логин");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Неверный адрес");
        }

        user = userDao.checkUser(login);

        if (user != null) {
            if (user.getEmail().equals(email)) {
                userDao.deleteLogin(user.getId());
                System.out.println("Вы разблокированны");
            }
        } else System.out.println("Ничего не найдено");
    }
}
