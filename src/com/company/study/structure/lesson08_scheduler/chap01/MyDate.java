package com.company.study.structure.lesson08_scheduler.chap01;

public class MyDate {
    public int year;
    public int month;
    public int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year +"/" + month+"/" +day +"/";
    }
}
