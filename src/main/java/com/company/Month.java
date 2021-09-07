package com.company;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Month {

    public static void main(String[] args) {
        calendar();
    }

    public static void calendar(){
        Date time = new Date();
        System.out.println(time);
        GregorianCalendar now = new GregorianCalendar();
        int today = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH);
        now.set(Calendar.DAY_OF_MONTH, 1);
        int weekday = now.get(Calendar.DAY_OF_WEEK);
        int FirstDayOfWeek = now.getFirstDayOfWeek();
        int in = 0;
        while (weekday != FirstDayOfWeek){
            in++;
            now.add(Calendar.DAY_OF_MONTH, -1);
            weekday = now.get(Calendar.DAY_OF_WEEK);
        }
        String [] WeekDayNames = new DateFormatSymbols().getShortWeekdays();
        do{
            System.out.print("   " + WeekDayNames[weekday]);
            now.add(Calendar.DAY_OF_MONTH, 1);
            weekday = now.get(Calendar.DAY_OF_WEEK);
        } while (weekday != FirstDayOfWeek);
        System.out.println();

        now.set(Calendar.DAY_OF_MONTH, 1);
        boolean flag = true;
        do{
            int day = now.get(Calendar.DAY_OF_MONTH);
            int temp=now.get(Calendar.DAY_OF_WEEK);
            if(flag){
                switch(temp){
                    case 1:
                        System.out.printf("%30s", "");
                        flag = false;
                        break;
                    case 2:
                        flag = false;
                        break;
                    case 3:
                        System.out.printf("%5s","");
                        flag = false;
                        break;
                    case 4:
                        System.out.printf("%10s", "");
                        flag = false;
                        break;
                    case 5:
                        System.out.printf("%15s","");
                        flag = false;
                        break;
                    case 6:
                        System.out.printf("%20s","");
                        flag = false;
                        break;
                    case 7:
                        System.out.printf("%25s","");
                        flag = false;
                        break;
                }
            }
            System.out.printf("%4d", day);
            if(day == today)
                System.out.print("*");
            else
                System.out.print(" ");
            now.add(Calendar.DAY_OF_MONTH, 1);
            weekday = now.get(Calendar.DAY_OF_WEEK);
            if (weekday == FirstDayOfWeek)
                System.out.println();
        }
        while(now.get(Calendar.MONTH) == month);
        if(weekday != FirstDayOfWeek)
            System.out.println();
    }
}