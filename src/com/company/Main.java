package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int countMon = 0, countTue = 0, countWen = 0, countThu = 0, countFri = 0, countSat = 0, countSun = 0;
        String[] month = new String[12];
        month[0] = "january";
        month[1] = "february";
        month[2] = "mart";
        month[3] = "april";
        month[4] = "may";
        month[5] = "lune";
        month[6] = "jule";
        month[7] = "august";
        month[8] = "september";
        month[9] = "october";
        month[10] = "november";
        month[11] = "december";

        LinkedHashMap<Days, Integer> mapDays = new LinkedHashMap<>();


        int numOfWeekDays = 0;
        for (int i = 1; i <= 100; i++) {
            Days days = new Days();
            int randomMonthDay = new Random().nextInt(31) + 1;
            int randomWeekDay = new Random().nextInt(7) + 1;

            getNumMonthDays(days, randomWeekDay);
            System.out.println(randomMonthDay + " " + month[new Random().nextInt(month.length)] + " " + days.getWeekDay());
//            getMup(mapDays, days); <-- почему этот метод не работает
            if (days.getWeekDay() == WeekDay.MONDAY) countMon++;
            else if (days.getWeekDay() == WeekDay.TUESDAY) countTue++;
            else if (days.getWeekDay() == WeekDay.WEDNESDAY) countWen++;
            else if (days.getWeekDay() == WeekDay.THURSDAY) countThu++;
            else if (days.getWeekDay() == WeekDay.FRIDAY) countFri++;
            else if (days.getWeekDay() == WeekDay.SATURDAY) countSat++;
            else if (days.getWeekDay() == WeekDay.SUNDAY) countSun++;
        }

        System.out.println("\n--------------------------\n");
        System.out.printf("Count of days of the week:\nMonday - %s\nTuesday - %s\nWednesday - %s\n" +
                "Thursday - %s\nFriday - %s\nSaturday - %s\nSunday - %s", countMon, countTue, countWen, countThu, countFri, countSat, countSun);
    }
    public static void getNumMonthDays(Days day, int num) {
        if (WeekDay.MONDAY.getNumOfDay() == num) day.setWeekDay(WeekDay.MONDAY);
        else if (WeekDay.TUESDAY.getNumOfDay() == num) day.setWeekDay(WeekDay.TUESDAY);
        else if (WeekDay.WEDNESDAY.getNumOfDay() == num) day.setWeekDay(WeekDay.WEDNESDAY);
        else if (WeekDay.THURSDAY.getNumOfDay() == num) day.setWeekDay(WeekDay.THURSDAY);
        else if (WeekDay.FRIDAY.getNumOfDay() == num) day.setWeekDay(WeekDay.FRIDAY);
        else if (WeekDay.SATURDAY.getNumOfDay() == num) day.setWeekDay(WeekDay.SATURDAY);
        else if (WeekDay.SUNDAY.getNumOfDay() == num) day.setWeekDay(WeekDay.SUNDAY);
    }

    public static void getMup(LinkedHashMap<Days, Integer> map, Days days) {
        if (map.containsKey(days)) {
            map.put(days, map.get(days) + 1);
        } else {
            map.put(days, 2);
        }

        for (Map.Entry<Days, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
