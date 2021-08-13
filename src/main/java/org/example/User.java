package org.example;


public class User {
    private String fullName;
    private String login;
    private String password;
    private String email;
    private String dateOfBir;

    public User(String fullName, String login, String password, String email, String dateOfBir) {
        this.fullName = fullName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.dateOfBir = dateOfBir;
    }

    public User() {
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBir() {
        return dateOfBir;
    }

    public void setDateOfBir(String dateOfBir) {
        this.dateOfBir = dateOfBir;
    }

    @Override
    public String toString() {
        return "User: " + fullName + " " + login + " " + password + " " + email + " " + dateOfBir;
    }
}
