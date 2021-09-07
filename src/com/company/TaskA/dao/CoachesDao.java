package com.company.TaskA.dao;

import com.company.TaskA.model.Coaches;

import java.util.List;

public interface CoachesDao {
    List<Coaches> getAll();
    boolean updateCoaches(Coaches coaches);
    int countCoaches();
    int sumSalaryAll();
}
