package com.company.TaskA;

import com.company.TaskA.dao.CoachesDao;
import com.company.TaskA.dao.impl.CoachesDaoimpl;
import com.company.TaskA.model.Coaches;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CoachesDao coachesDao = (CoachesDao) new CoachesDaoimpl();
        System.out.println("List of coaches: ");

        List<Coaches> coaches = coachesDao.getAll();
        for (Coaches coachesFor : coaches) {
            System.out.println(coachesFor);
        }

        int coachesSum = coachesDao.sumSalaryAll();
        System.out.println("------------------------\nSum of the salaries:\n" + coachesSum);

        for (Coaches coaches1 : coaches) {
            if (coaches1.getFullName().length() > 3)
                System.out.println(coaches1 + " Молодец!!!");
        }
    }
}
