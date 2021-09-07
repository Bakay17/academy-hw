package org.example.model;

import java.sql.Timestamp;

public class UserLog {
    private Integer id;
    private Boolean isGood;
    private Integer userId;
    private Timestamp timeLogs;

    public UserLog() {
    }

    public UserLog(Integer id, Boolean isGood, Integer userId, Timestamp timeLogs) {
        this.id = id;
        this.isGood = isGood;
        this.userId = userId;
        this.timeLogs = timeLogs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getGood() {
        return isGood;
    }

    public void setGood(Boolean flag) {
        isGood = flag;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Timestamp getTimeLogs() {
        return timeLogs;
    }

    public void setTimeLogs(Timestamp timeLogs) {
        this.timeLogs = timeLogs;
    }
}
