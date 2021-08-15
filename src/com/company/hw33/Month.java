package com.company.hw33;

import java.util.EnumSet;

public enum Month {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MART("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULE("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private String title;

    Month(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


//    public int compareTo(EnumSet<Month> month) {
//        int res = 0;
//        if (this.title.length() < month.getTitle().length()) {
//            res =- 1;
//        }
//        if (this.title.length() > month.getTitle().length()) {
//            res = 1;
//        }
//        return res;
//    }

    @Override
    public String toString() {
        return title;
    }
}


