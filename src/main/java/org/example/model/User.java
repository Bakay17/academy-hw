package org.example.model;

import java.sql.Timestamp;

public class User {
    private Integer id;
    private String login;
    private String email;
    private String password;
    private Timestamp dateOfReg;

    public User(){
    }

    public User(Integer id, String login, String email, String password, Timestamp dateOfReg) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
        this.dateOfReg = dateOfReg;
    }

    public User(String login, String email, String password) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getDateOfReg() {
        return dateOfReg;
    }

    public void setDateOfReg(Timestamp dateOfReg) {
        this.dateOfReg = dateOfReg;
    }
}
