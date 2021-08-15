package com.company;

public enum WeekDay {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int numOfDay;
    WeekDay(Integer numOfDay) {
        this.numOfDay = numOfDay;
    }

    public int getNumOfDay() {
        return numOfDay;
    }
}
