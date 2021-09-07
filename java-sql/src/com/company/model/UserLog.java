package com.company.model;

import java.sql.Timestamp;

public class UserLog {
    private Integer id;
    private Boolean isFlag;
    private Integer userId;
    private Timestamp timeLogs;

    public UserLog() {
    }

    public UserLog(Integer id, Boolean isFlag, Integer userId, Timestamp timeLogs) {
        this.id = id;
        this.isFlag = isFlag;
        this.userId = userId;
        this.timeLogs = timeLogs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getFlag() {
        return isFlag;
    }

    public void setFlag(Boolean flag) {
        isFlag = flag;
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
